package com.tencent.mm.plugin.emoji.ui.picker;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/picker/FinderTabFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class FinderTabFragment extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment {

    /* renamed from: d, reason: collision with root package name */
    public int f98147d = 11;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f98148e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f98149f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f98150g;

    /* renamed from: h, reason: collision with root package name */
    public int f98151h;

    public void j0(byte[] bArr) {
        android.content.Intent intent = new android.content.Intent(requireContext(), (java.lang.Class<?>) com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity.class);
        intent.putExtra("is_video", true);
        intent.putExtra("finder_object_bytes", bArr);
        intent.putExtra("query_source_type", this.f98147d);
        java.lang.String str = this.f98148e;
        if (str == null) {
            kotlin.jvm.internal.o.o("appId");
            throw null;
        }
        intent.putExtra("appId", str);
        java.lang.String str2 = this.f98149f;
        if (str2 == null) {
            kotlin.jvm.internal.o.o(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE);
            throw null;
        }
        intent.putExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE, str2);
        java.lang.String str3 = this.f98150g;
        if (str3 == null) {
            kotlin.jvm.internal.o.o("query");
            throw null;
        }
        intent.putExtra("query", str3);
        intent.putExtra("key_from_scene", this.f98151h);
        startActivityForResult(intent, 1048576);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1048576 && i18 == -1) {
            androidx.fragment.app.FragmentActivity requireActivity = requireActivity();
            requireActivity.setResult(-1, intent);
            if (this.f98147d == 46) {
                return;
            }
            requireActivity.finish();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            this.f98147d = arguments.getInt("query_source_type", 11);
            java.lang.String string = arguments.getString("appId", "");
            kotlin.jvm.internal.o.f(string, "getString(...)");
            this.f98148e = string;
            java.lang.String string2 = arguments.getString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE, "");
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            this.f98149f = string2;
            java.lang.String string3 = arguments.getString("query", "");
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            this.f98150g = string3;
            this.f98151h = arguments.getInt("key_from_scene", 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.o.f(requireContext, "requireContext(...)");
        com.tencent.mm.mm_compose.MMComposeView mMComposeView = new com.tencent.mm.mm_compose.MMComposeView(requireContext, null, 2, null);
        mMComposeView.setContent(u0.j.c(-831414379, true, new e22.i(this)));
        return mMComposeView;
    }
}

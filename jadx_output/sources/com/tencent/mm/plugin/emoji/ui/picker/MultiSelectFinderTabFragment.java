package com.tencent.mm.plugin.emoji.ui.picker;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/picker/MultiSelectFinderTabFragment;", "Lcom/tencent/mm/plugin/emoji/ui/picker/FinderTabFragment;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MultiSelectFinderTabFragment extends com.tencent.mm.plugin.emoji.ui.picker.FinderTabFragment {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f98159m = 0;

    /* renamed from: i, reason: collision with root package name */
    public e22.d1 f98160i;

    @Override // com.tencent.mm.plugin.emoji.ui.picker.FinderTabFragment
    public void j0(byte[] bArr) {
        java.lang.String str;
        androidx.fragment.app.FragmentActivity activity = getActivity();
        com.tencent.mm.plugin.emoji.ui.picker.MultiEmojiMediaPickerUI multiEmojiMediaPickerUI = activity instanceof com.tencent.mm.plugin.emoji.ui.picker.MultiEmojiMediaPickerUI ? (com.tencent.mm.plugin.emoji.ui.picker.MultiEmojiMediaPickerUI) activity : null;
        android.content.Intent intent = new android.content.Intent(requireContext(), (java.lang.Class<?>) com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity.class);
        intent.putExtra("is_video", true);
        intent.putExtra("finder_object_bytes", bArr);
        intent.putExtra("query_source_type", this.f98147d);
        intent.putExtra("key_from_scene", this.f98151h);
        if (multiEmojiMediaPickerUI != null && (str = multiEmojiMediaPickerUI.f98158o) != null) {
            intent.putExtra("addstickers_sessionid", str);
        }
        intent.putExtra("media_type_list", new int[]{2});
        intent.putStringArrayListExtra("media_path_list", kz5.c0.d(""));
        startActivityForResult(intent, 1048576);
    }

    public final boolean l0() {
        e22.d1 d1Var = this.f98160i;
        return d1Var != null && (d1Var.f246639m.isEmpty() ^ true);
    }

    @Override // com.tencent.mm.plugin.emoji.ui.picker.FinderTabFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(this).a(e22.d1.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f98160i = (e22.d1) a17;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.picker.FinderTabFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.o.f(requireContext, "requireContext(...)");
        com.tencent.mm.mm_compose.MMComposeView mMComposeView = new com.tencent.mm.mm_compose.MMComposeView(requireContext, null, 2, null);
        mMComposeView.setContent(u0.j.c(-599007837, true, new e22.l1(this)));
        return mMComposeView;
    }
}

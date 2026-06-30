package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/picker/MultiSelectFinderTabFragment;", "Lcom/tencent/mm/plugin/emoji/ui/picker/FinderTabFragment;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emoji.ui.picker.MultiSelectFinderTabFragment */
/* loaded from: classes10.dex */
public final class C13340xd9e4c60a extends com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13336xbf8c9cdf {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f179692m = 0;

    /* renamed from: i, reason: collision with root package name */
    public e22.d1 f179693i;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13336xbf8c9cdf
    public void j0(byte[] bArr) {
        java.lang.String str;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13339x8f3095f9 activityC13339x8f3095f9 = mo7430x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13339x8f3095f9 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13339x8f3095f9) mo7430x19263085 : null;
        android.content.Intent intent = new android.content.Intent(m7550xf0c4608a(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9.class);
        intent.putExtra("is_video", true);
        intent.putExtra("finder_object_bytes", bArr);
        intent.putExtra("query_source_type", this.f179680d);
        intent.putExtra("key_from_scene", this.f179684h);
        if (activityC13339x8f3095f9 != null && (str = activityC13339x8f3095f9.f179691o) != null) {
            intent.putExtra("addstickers_sessionid", str);
        }
        intent.putExtra("media_type_list", new int[]{2});
        intent.putStringArrayListExtra("media_path_list", kz5.c0.d(""));
        m7587x5dc77fb5(intent, 1048576);
    }

    public final boolean l0() {
        e22.d1 d1Var = this.f179693i;
        return d1Var != null && (d1Var.f328172m.isEmpty() ^ true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13336xbf8c9cdf, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(this).a(e22.d1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f179693i = (e22.d1) a17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13336xbf8c9cdf, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        android.content.Context m7550xf0c4608a = m7550xf0c4608a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7550xf0c4608a, "requireContext(...)");
        com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197 c11098x3efa6197 = new com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197(m7550xf0c4608a, null, 2, null);
        c11098x3efa6197.m47820xe9f5bdb7(u0.j.c(-599007837, true, new e22.l1(this)));
        return c11098x3efa6197;
    }
}

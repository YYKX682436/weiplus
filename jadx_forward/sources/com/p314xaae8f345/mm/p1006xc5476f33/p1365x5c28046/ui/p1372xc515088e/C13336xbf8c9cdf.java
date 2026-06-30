package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/picker/FinderTabFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emoji.ui.picker.FinderTabFragment */
/* loaded from: classes10.dex */
public class C13336xbf8c9cdf extends com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6 {

    /* renamed from: d, reason: collision with root package name */
    public int f179680d = 11;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f179681e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f179682f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f179683g;

    /* renamed from: h, reason: collision with root package name */
    public int f179684h;

    public void j0(byte[] bArr) {
        android.content.Intent intent = new android.content.Intent(m7550xf0c4608a(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62.class);
        intent.putExtra("is_video", true);
        intent.putExtra("finder_object_bytes", bArr);
        intent.putExtra("query_source_type", this.f179680d);
        java.lang.String str = this.f179681e;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appId");
            throw null;
        }
        intent.putExtra("appId", str);
        java.lang.String str2 = this.f179682f;
        if (str2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f);
            throw null;
        }
        intent.putExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f, str2);
        java.lang.String str3 = this.f179683g;
        if (str3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("query");
            throw null;
        }
        intent.putExtra("query", str3);
        intent.putExtra("key_from_scene", this.f179684h);
        m7587x5dc77fb5(intent, 1048576);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityResult */
    public void mo7496x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo7496x9d4787cb(i17, i18, intent);
        if (i17 == 1048576 && i18 == -1) {
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f m7548xe6e42394 = m7548xe6e42394();
            m7548xe6e42394.setResult(-1, intent);
            if (this.f179680d == 46) {
                return;
            }
            m7548xe6e42394.finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        android.os.Bundle m7436x8619eaa0 = m7436x8619eaa0();
        if (m7436x8619eaa0 != null) {
            this.f179680d = m7436x8619eaa0.getInt("query_source_type", 11);
            java.lang.String string = m7436x8619eaa0.getString("appId", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            this.f179681e = string;
            java.lang.String string2 = m7436x8619eaa0.getString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f, "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            this.f179682f = string2;
            java.lang.String string3 = m7436x8619eaa0.getString("query", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            this.f179683g = string3;
            this.f179684h = m7436x8619eaa0.getInt("key_from_scene", 0);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        android.content.Context m7550xf0c4608a = m7550xf0c4608a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7550xf0c4608a, "requireContext(...)");
        com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197 c11098x3efa6197 = new com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197(m7550xf0c4608a, null, 2, null);
        c11098x3efa6197.m47820xe9f5bdb7(u0.j.c(-831414379, true, new e22.i(this)));
        return c11098x3efa6197;
    }
}

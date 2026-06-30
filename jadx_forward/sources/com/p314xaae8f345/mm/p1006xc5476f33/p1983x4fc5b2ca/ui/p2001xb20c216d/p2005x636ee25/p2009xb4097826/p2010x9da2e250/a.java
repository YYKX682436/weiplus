package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250;

/* loaded from: classes5.dex */
public final class a implements wt3.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250.C17068xcb12955 f237893a;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250.C17068xcb12955 c17068xcb12955) {
        this.f237893a = c17068xcb12955;
    }

    @Override // wt3.i0
    public void a(java.util.LinkedList bgmList, boolean z17, boolean z18, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bgmList, "bgmList");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250.C17068xcb12955 c17068xcb12955 = this.f237893a;
        if (c17068xcb12955.f237931q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicPickerEditRecommendFragment", "EditorView has been destroyed, skip callback");
            return;
        }
        c17068xcb12955.f237933s = !bgmList.isEmpty();
        dv3.c cVar = c17068xcb12955.f237914e;
        if (cVar != null) {
            cVar.P0(1);
        }
        this.f237893a.U0(bgmList, z17, z18, j17);
    }

    @Override // wt3.i0
    /* renamed from: getActivity */
    public android.app.Activity mo68371x19263085() {
        return this.f237893a.mo7430x19263085();
    }
}

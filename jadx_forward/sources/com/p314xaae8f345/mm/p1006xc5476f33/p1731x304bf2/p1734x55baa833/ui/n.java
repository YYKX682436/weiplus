package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui;

/* loaded from: classes5.dex */
public final class n implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g43.x f220384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.t f220385e;

    public n(g43.x xVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.t tVar) {
        this.f220384d = xVar;
        this.f220385e = tVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String obj = r26.n0.u0(java.lang.String.valueOf(editable)).toString();
        boolean z17 = obj.length() == 0;
        g43.x xVar = this.f220384d;
        if (z17 || !(!r26.n0.N(obj))) {
            w33.b bVar = (w33.b) xVar.f350327d.mo3195x754a37bb();
            if (bVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.q.a(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.q.f220388a, bVar, this.f220385e, false);
                return;
            }
            return;
        }
        xVar.getClass();
        java.lang.String str = xVar.f350329f;
        if (str != null) {
            p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.d1.a(xVar), (oz5.l) xVar.f350334n.mo141623x754a37bb(), null, new g43.v(xVar, obj, str, null), 2, null);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes4.dex */
public final class a3 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3 f232557d;

    public a3(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3 c3Var) {
        this.f232557d = c3Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        r45.ss4 ss4Var;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        o01.a aVar = (o01.a) obj;
        if (aVar.f440817a == q01.f.f440809e) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("syncBeatTrack sceneEnd errType:");
            sb6.append(aVar.f440818b);
            sb6.append(" errCode:");
            int i17 = aVar.f440819c;
            sb6.append(i17);
            sb6.append(" errMsg:");
            sb6.append(aVar.f440820d);
            sb6.append(" flexSize:");
            r45.tr4 tr4Var = (r45.tr4) aVar.f440822f;
            sb6.append((tr4Var == null || (linkedList2 = tr4Var.f468279e) == null) ? null : new java.lang.Integer(linkedList2.size()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvMakerDataUIC", sb6.toString());
            if (i17 == 0 && (ss4Var = (r45.ss4) this.f232557d.f232609f.mo3195x754a37bb()) != null) {
                ss4Var.set(6, java.lang.Integer.valueOf((tr4Var == null || (linkedList = tr4Var.f468279e) == null) ? 20 : linkedList.size()));
            }
        }
        return jz5.f0.f384359a;
    }
}

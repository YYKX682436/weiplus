package l31;

/* loaded from: classes9.dex */
public final class e0 implements f31.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l31.f0 f396873d;

    public e0(l31.f0 f0Var) {
        this.f396873d = f0Var;
    }

    @Override // f31.e
    public void a(int i17, int i18, java.lang.String errMsg, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        java.lang.Object[] objArr = new java.lang.Object[5];
        boolean z17 = false;
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = errMsg;
        objArr[3] = java.lang.Integer.valueOf(this.f396873d.hashCode());
        objArr[4] = (c11158xe7d16ed5 == null || (arrayList2 = c11158xe7d16ed5.f153318h) == null) ? null : java.lang.Integer.valueOf(arrayList2.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateSubscribeMsgListTask", "updateSubscribeMsgList end errType: %d, errCode: %d, errMsg: %s, hashCode: %s, tmpSize: %s", objArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        java.lang.String str = this.f396873d.f396846a.length() > 0 ? this.f396873d.f396846a : this.f396873d.f396878i;
        if (i17 == 0 && i18 == 0) {
            if (!this.f396873d.f396880k) {
                if (!r1.f396877h.isEmpty()) {
                    if (c11158xe7d16ed5 != null && (arrayList = c11158xe7d16ed5.f153318h) != null && (!arrayList.isEmpty())) {
                        z17 = true;
                    }
                    if (z17) {
                        c0Var.f391645d = true;
                    }
                }
                ((ku5.t0) ku5.t0.f394148d).B(new l31.c0(c0Var, this.f396873d, str, c11158xe7d16ed5));
            }
        }
        ((ku5.t0) ku5.t0.f394148d).B(new l31.d0(i17, i18, c11158xe7d16ed5, this.f396873d, str, errMsg));
    }
}

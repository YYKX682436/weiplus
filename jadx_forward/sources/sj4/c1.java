package sj4;

/* loaded from: classes11.dex */
public final class c1 implements bi4.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bi4.l1 f490360a;

    public c1(bi4.l1 l1Var) {
        this.f490360a = l1Var;
    }

    @Override // bi4.l1
    /* renamed from: onFinishAction */
    public final void mo10624xfbbb8828(int i17, java.lang.String str, pj4.r0 r0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFinishAction result:");
        sb6.append(i17);
        sb6.append(", errMsg:");
        sb6.append(str);
        sb6.append(", resultInfo:");
        java.lang.String str2 = null;
        if (r0Var != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("resultInfo: action:");
            sb7.append(r0Var.f436805d);
            sb7.append(" ResultSetTextStatus:");
            pj4.w wVar = r0Var.f436806e;
            if (wVar != null) {
                str2 = "iconId:" + wVar.f436845e + " iconDesc:" + wVar.f436844d;
            }
            sb7.append(str2);
            str2 = sb7.toString();
        }
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusActionService", sb6.toString());
        bi4.l1 l1Var = this.f490360a;
        if (l1Var != null) {
            l1Var.mo10624xfbbb8828(i17, str, r0Var);
        }
    }
}

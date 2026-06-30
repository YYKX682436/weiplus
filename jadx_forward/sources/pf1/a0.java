package pf1;

/* loaded from: classes7.dex */
public final class a0 extends gb1.f {

    /* renamed from: CTRL_INDEX */
    @java.lang.Deprecated
    public static final int f76408x366c91de = -2;

    /* renamed from: NAME */
    @java.lang.Deprecated
    public static final java.lang.String f76409x24728b = "removeHTMLVConsoleView";

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return data.optInt("htmlId");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gb1.f
    public boolean J(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) tVar;
        pf1.c cVar = view instanceof pf1.c ? (pf1.c) view : null;
        if (cVar == null || v5Var == null) {
            return true;
        }
        v5Var.m1(cVar);
        return true;
    }
}

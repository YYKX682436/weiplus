package l62;

/* loaded from: classes8.dex */
public class d extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f398299e = {l75.n0.m145250x3fdc6f77(j62.c.I, "ExptItem")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f398300f = new java.lang.String[0];

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f398301d;

    public d(l75.k0 k0Var) {
        super(k0Var, j62.c.I, "ExptItem", f398300f);
        this.f398301d = k0Var;
    }

    public final boolean y0(int i17) {
        int i18;
        try {
            i18 = this.f398301d.mo70514xb06685ab("ExptItem", "exptId=?", new java.lang.String[]{i17 + ""});
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExptStorage", "delete expt by id [%s]", e17.toString());
            i18 = 0;
        }
        return i18 > 0;
    }

    public java.util.List z0(java.util.List list) {
        long j17;
        d95.b0 b0Var = null;
        if (list == null || list.size() <= 0) {
            return null;
        }
        l75.k0 k0Var = this.f398301d;
        if (k0Var instanceof d95.b0) {
            b0Var = (d95.b0) k0Var;
            j17 = b0Var.b();
        } else {
            j17 = -1;
        }
        try {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                j62.c cVar = (j62.c) it.next();
                boolean z17 = false;
                if (cVar != null) {
                    try {
                        z17 = super.mo11260x413cb2b4(cVar);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExptStorage", "replace expt error [%s]", e17.toString());
                    }
                    cVar.m140412x9616526c();
                }
                if (z17) {
                    linkedList.add(cVar);
                }
            }
            return linkedList;
        } finally {
            if (b0Var != null) {
                b0Var.w(java.lang.Long.valueOf(j17));
            }
        }
    }
}

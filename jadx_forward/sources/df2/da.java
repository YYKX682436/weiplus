package df2;

/* loaded from: classes.dex */
public final class da extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.zb f311494d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(df2.zb zbVar) {
        super(1);
        this.f311494d = zbVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        java.util.List results = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(results, "results");
        int i17 = 0;
        if (!results.isEmpty()) {
            java.util.Iterator it = results.iterator();
            while (it.hasNext()) {
                if (!((r45.mf1) it.next()).m75933x41a8a7f2(4)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            df2.zb zbVar = this.f311494d;
            java.lang.String str = zbVar.f313472m;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[aiAssistant] some tool calls failed, count=");
            if (!results.isEmpty()) {
                java.util.Iterator it6 = results.iterator();
                while (it6.hasNext()) {
                    if ((!((r45.mf1) it6.next()).m75933x41a8a7f2(4)) && (i17 = i17 + 1) < 0) {
                        kz5.c0.o();
                        throw null;
                    }
                }
            }
            sb6.append(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            db5.t7.g(zbVar.O6(), "AI工具执行失败");
        }
        return jz5.f0.f384359a;
    }
}

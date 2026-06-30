package ls1;

/* loaded from: classes7.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls1.e0 f402499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f402500e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f402501f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f402502g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(ls1.e0 e0Var, long j17, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, long j18) {
        super(1);
        this.f402499d = e0Var;
        this.f402500e = j17;
        this.f402501f = c0Var;
        this.f402502g = j18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Collection collection;
        java.lang.String value = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402499d.B1(), "onReceivePageData, jsContent evaluateJavascript cb, ret = " + value + ", view " + this.f402499d.f263449a.m81403xce19f7b8());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f402499d.f402511d2 = r26.n0.B(value, "ok", false);
        is1.l lVar = is1.l.f375956a;
        ls1.e0 e0Var = this.f402499d;
        lVar.k(e0Var.N1, e0Var.f402511d2);
        ls1.e0 e0Var2 = this.f402499d;
        ax4.a.b(e0Var2.N1.f470833o, e0Var2.f402511d2 ? 130 : 129, 1, true);
        this.f402499d.V.a("onInjectEnd", currentTimeMillis);
        java.util.List g17 = new r26.t(",").g(r26.i0.t(value, "\"", "", false), 0);
        if (!g17.isEmpty()) {
            java.util.ListIterator listIterator = g17.listIterator(g17.size());
            while (listIterator.hasPrevious()) {
                if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                    collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = kz5.p0.f395529d;
        java.lang.String[] strArr = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
        if (!(strArr.length == 0)) {
            java.lang.String input = strArr[strArr.length - 1];
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[0-9\\.]+");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
            if (compile.matcher(input).matches()) {
                this.f402499d.V.a("onWebInjectEnd", (long) java.lang.Double.valueOf(strArr[strArr.length - 1]).doubleValue());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402499d.B1(), "terry trace 2.1 onReceivePageData ret:" + value + " eval:" + (currentTimeMillis - this.f402500e));
        ls1.e0 e0Var3 = this.f402499d;
        if (e0Var3.f402511d2) {
            e0Var3.I(-112);
        } else {
            e0Var3.I(-113);
        }
        ((ku5.t0) ku5.t0.f394148d).B(new ls1.b0(this.f402499d));
        ax4.a.d(this.f402501f.f391645d ? 126 : 122, currentTimeMillis - this.f402502g);
        return jz5.f0.f384359a;
    }
}

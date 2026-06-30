package dy4;

/* loaded from: classes8.dex */
public class k implements eg.c {

    /* renamed from: d, reason: collision with root package name */
    public static dy4.k f326212d;

    @Override // eg.c
    public eg.b Ua(java.lang.String str) {
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1274447834:
                if (str.equals("finder")) {
                    c17 = 0;
                    break;
                }
                break;
            case 112202875:
                if (str.equals("video")) {
                    c17 = 1;
                    break;
                }
                break;
            case 1693182669:
                if (str.equals("liveplayer")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
            case 1:
                dy4.f1 f1Var = new dy4.f1();
                dy4.w wVar = new dy4.w();
                wVar.f326250c = f1Var;
                f1Var.U = wVar;
                dy4.m mVar = new dy4.m();
                f1Var.V = mVar;
                mVar.b(new dy4.q0(f1Var));
                return f1Var;
            case 2:
                return new dy4.j();
            default:
                return null;
        }
    }
}

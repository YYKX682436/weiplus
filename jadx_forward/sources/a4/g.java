package a4;

/* loaded from: classes13.dex */
public class g extends a4.b {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f82700a;

    /* renamed from: b, reason: collision with root package name */
    public final a4.f f82701b;

    public g(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.l1 l1Var) {
        this.f82700a = yVar;
        this.f82701b = (a4.f) new p012xc85e97e9.p093xedfae76a.j1(l1Var, a4.f.f82697f).a(a4.f.class);
    }

    @Override // a4.b
    public void a(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        x.o oVar = this.f82701b.f82698d;
        if (oVar.h() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            java.lang.String str2 = str + "    ";
            for (int i17 = 0; i17 < oVar.h(); i17++) {
                a4.c cVar = (a4.c) oVar.i(i17);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(oVar.f(i17));
                printWriter.print(": ");
                printWriter.println(cVar.m524x9616526c());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(cVar.f82688d);
                printWriter.print(" mArgs=");
                printWriter.println(cVar.f82689e);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                p012xc85e97e9.p094xbe953013.p095x38b73479.e eVar = cVar.f82690f;
                printWriter.println(eVar);
                eVar.mo7828x2f39f4(str2 + "  ", fileDescriptor, printWriter, strArr);
                if (cVar.f82692h != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(cVar.f82692h);
                    a4.d dVar = cVar.f82692h;
                    dVar.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(dVar.f82696f);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                printWriter.println(eVar.m7841xe5325c36(cVar.mo3195x754a37bb()));
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(cVar.m7804x22d78dfd());
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m529x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
        sb6.append("LoaderManager{");
        sb6.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb6.append(" in ");
        m3.b.a(this.f82700a, sb6);
        sb6.append("}}");
        return sb6.toString();
    }
}

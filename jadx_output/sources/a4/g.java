package a4;

/* loaded from: classes13.dex */
public class g extends a4.b {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.y f1167a;

    /* renamed from: b, reason: collision with root package name */
    public final a4.f f1168b;

    public g(androidx.lifecycle.y yVar, androidx.lifecycle.l1 l1Var) {
        this.f1167a = yVar;
        this.f1168b = (a4.f) new androidx.lifecycle.j1(l1Var, a4.f.f1164f).a(a4.f.class);
    }

    @Override // a4.b
    public void a(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        x.o oVar = this.f1168b.f1165d;
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
                printWriter.println(cVar.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(cVar.f1155d);
                printWriter.print(" mArgs=");
                printWriter.println(cVar.f1156e);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                androidx.loader.content.e eVar = cVar.f1157f;
                printWriter.println(eVar);
                eVar.dump(str2 + "  ", fileDescriptor, printWriter, strArr);
                if (cVar.f1159h != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(cVar.f1159h);
                    a4.d dVar = cVar.f1159h;
                    dVar.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(dVar.f1163f);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                printWriter.println(eVar.dataToString(cVar.getValue()));
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(cVar.hasActiveObservers());
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
        sb6.append("LoaderManager{");
        sb6.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb6.append(" in ");
        m3.b.a(this.f1167a, sb6);
        sb6.append("}}");
        return sb6.toString();
    }
}

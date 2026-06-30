package db5;

/* loaded from: classes8.dex */
public class m0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f309970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f309971e;

    public m0(java.lang.String str, java.util.ArrayList arrayList) {
        this.f309970d = str;
        this.f309971e = arrayList;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        g4Var.setHeaderTitle(this.f309970d);
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f309971e;
            if (i17 >= arrayList.size()) {
                return;
            }
            g4Var.f(i17, (java.lang.CharSequence) arrayList.get(i17));
            i17++;
        }
    }
}

package gm0;

/* loaded from: classes11.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gm0.m f354720d;

    public g(gm0.m mVar) {
        this.f354720d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        gm0.m mVar = this.f354720d;
        int size = ((java.util.LinkedList) mVar.f354783m).size();
        c01.y8[] y8VarArr = new c01.y8[size];
        ((java.util.LinkedList) mVar.f354783m).toArray(y8VarArr);
        for (int i17 = 0; i17 < size; i17++) {
            y8VarArr[i17].a0();
        }
        fs.g.b(c01.z8.class, new gm0.C28425x2f5e1a());
    }
}

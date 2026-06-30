package yk5;

/* loaded from: classes11.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f544422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yk5.u f544423e;

    public m(yk5.u uVar, java.util.List list) {
        this.f544423e = uVar;
        this.f544422d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        yk5.u uVar = this.f544423e;
        if (uVar.f544445v == null) {
            uVar.f544445v = new java.util.ArrayList();
        }
        uVar.f544445v.clear();
        uVar.f544445v.addAll(this.f544422d);
        uVar.f544445v.add("officialaccounts");
        uVar.f544445v.add("helper_entry");
    }
}

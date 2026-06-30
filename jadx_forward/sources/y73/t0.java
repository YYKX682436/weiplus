package y73;

/* loaded from: classes11.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f541287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f541288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f541289f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f541290g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f541291h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f541292i;

    public t0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2) {
        this.f541287d = str;
        this.f541288e = str2;
        this.f541289f = str3;
        this.f541290g = str4;
        this.f541291h = onClickListener;
        this.f541292i = onClickListener2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5629x57faa6c1 c5629x57faa6c1 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5629x57faa6c1();
        q45.b bVar = new q45.b();
        bVar.f441658e = this.f541287d;
        bVar.f441659f = this.f541288e;
        bVar.f441660g = new java.util.LinkedList();
        q45.a aVar = new q45.a();
        aVar.f441655f = this.f541289f;
        bVar.f441660g.add(aVar);
        q45.a aVar2 = new q45.a();
        aVar2.f441655f = this.f541290g;
        bVar.f441660g.add(aVar2);
        am.zg zgVar = c5629x57faa6c1.f135957g;
        zgVar.f90097d = 1;
        zgVar.f90094a = bVar;
        zgVar.f90095b = this.f541291h;
        zgVar.f90096c = this.f541292i;
        c5629x57faa6c1.e();
    }
}

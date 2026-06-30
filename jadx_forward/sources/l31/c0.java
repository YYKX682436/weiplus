package l31;

/* loaded from: classes9.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f396860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l31.f0 f396861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396862f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 f396863g;

    public c0(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, l31.f0 f0Var, java.lang.String str, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5) {
        this.f396860d = c0Var;
        this.f396861e = f0Var;
        this.f396862f = str;
        this.f396863g = c11158xe7d16ed5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f396860d.f391645d;
        l31.f0 f0Var = this.f396861e;
        com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5 = this.f396863g;
        if (!z17) {
            k31.a aVar = f0Var.f396876g;
            if (aVar != null) {
                ((k31.h) aVar).i(this.f396862f, null, c11158xe7d16ed5 != null ? c11158xe7d16ed5.f153322o : false, true, false);
                return;
            }
            return;
        }
        k31.a aVar2 = f0Var.f396876g;
        if (aVar2 != null) {
            java.lang.String str = this.f396862f;
            java.util.ArrayList arrayList = c11158xe7d16ed5 != null ? c11158xe7d16ed5.f153318h : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList);
            ((k31.h) aVar2).i(str, arrayList, c11158xe7d16ed5.f153322o, true, false);
        }
    }
}

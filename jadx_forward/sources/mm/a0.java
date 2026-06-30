package mm;

/* loaded from: classes12.dex */
public class a0 extends rh.d3 {

    /* renamed from: d, reason: collision with root package name */
    public rh.x2 f409997d = rh.x2.b(0L);

    /* renamed from: e, reason: collision with root package name */
    public rh.x2 f409998e = rh.x2.b(0L);

    /* renamed from: f, reason: collision with root package name */
    public rh.x2 f409999f = rh.x2.b(0L);

    /* renamed from: g, reason: collision with root package name */
    public rh.x2 f410000g = rh.x2.b(0L);

    /* renamed from: h, reason: collision with root package name */
    public rh.x2 f410001h = rh.x2.b(0L);

    /* renamed from: i, reason: collision with root package name */
    public rh.x2 f410002i = rh.x2.b(0L);

    /* renamed from: j, reason: collision with root package name */
    public rh.x2 f410003j = rh.x2.b(0L);

    public static mm.a0 b() {
        mm.a0 a0Var = new mm.a0();
        mm.y yVar = mm.w.f410078d;
        a0Var.f409997d = rh.x2.b(java.lang.Long.valueOf(yVar.f410103c));
        a0Var.f409998e = rh.x2.b(java.lang.Long.valueOf(yVar.f410106f));
        mm.y yVar2 = mm.w.f410080f;
        a0Var.f409999f = rh.x2.b(java.lang.Long.valueOf(yVar2.f410103c));
        a0Var.f410000g = rh.x2.b(java.lang.Long.valueOf(yVar2.f410106f));
        mm.y yVar3 = mm.w.f410084j;
        a0Var.f410001h = rh.x2.b(java.lang.Long.valueOf(yVar3.f410103c));
        a0Var.f410002i = rh.x2.b(java.lang.Long.valueOf(yVar3.f410106f));
        a0Var.f410003j = rh.x2.b(java.lang.Long.valueOf(mm.w.f410077c));
        return a0Var;
    }

    @Override // rh.d3
    public rh.o2 a(rh.d3 d3Var) {
        return new mm.z(this, (mm.a0) d3Var, this);
    }
}

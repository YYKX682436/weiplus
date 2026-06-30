package zs5;

/* loaded from: classes9.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zs5.y f556869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f556870e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f556871f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f556872g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f556873h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f556874i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f556875m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f556876n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zs5.y yVar, byte[] bArr, android.graphics.Point point, int i17, int i18, android.graphics.Rect rect, android.graphics.Rect rect2, long j17) {
        super(0);
        this.f556869d = yVar;
        this.f556870e = bArr;
        this.f556871f = point;
        this.f556872g = i17;
        this.f556873h = i18;
        this.f556874i = rect;
        this.f556875m = rect2;
        this.f556876n = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 d1Var;
        int i17 = this.f556872g;
        int i18 = this.f556873h;
        zs5.y yVar = this.f556869d;
        yVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (yVar.f557047o == 0 && (d1Var = yVar.f557041i) != null) {
            yVar.f557047o = currentTimeMillis - d1Var.f298521g;
        }
        android.graphics.Point point = this.f556871f;
        java.util.Objects.toString(point);
        java.util.Objects.toString(this.f556874i);
        android.graphics.Rect rect = this.f556875m;
        java.util.Objects.toString(rect);
        byte[] bArr = this.f556870e;
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        long j17 = yVar.f557055w + 1;
        yVar.f557055w = j17;
        yVar.f557051s.put(java.lang.Long.valueOf(j17), allocateDirect);
        yVar.f557052t.put(java.lang.Long.valueOf(j17), bArr);
        yVar.f557035c = point;
        yVar.f557036d = i17;
        yVar.f557037e = i18;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.x xVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.x();
        xVar.f298685d = j17;
        xVar.f298686e = bArr.length;
        xVar.f298687f = point.x;
        xVar.f298688g = point.y;
        xVar.f298689h = i17;
        xVar.f298690i = et5.h.g(i18);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0 u0Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.u0();
        u0Var.f298672d = rect.top;
        u0Var.f298673e = rect.left;
        u0Var.f298674f = rect.width();
        u0Var.f298675g = rect.height();
        xVar.f298691m = u0Var;
        xVar.f298692n = this.f556876n;
        xVar.f298693o = currentTimeMillis2;
        xVar.f298694p = currentTimeMillis;
        xVar.f298695q = yVar.f557047o;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.h0.f298581b.a(allocateDirect, xVar, new zs5.h(currentTimeMillis, yVar, bArr, point, i17, i18, j17, allocateDirect));
        return jz5.f0.f384359a;
    }
}

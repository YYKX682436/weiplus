package un0;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f510885a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Intent f510886b;

    /* renamed from: c, reason: collision with root package name */
    public int f510887c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f510888d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f510889e;

    /* renamed from: f, reason: collision with root package name */
    public long f510890f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.SurfaceTexture f510891g;

    /* renamed from: h, reason: collision with root package name */
    public int f510892h;

    /* renamed from: i, reason: collision with root package name */
    public int f510893i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.r f510894j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.List f510895k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.List f510896l;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.a f510897m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f510898n;

    public h(boolean z17, android.content.Intent intent, int i17, boolean z18, android.graphics.Bitmap bitmap, long j17, android.graphics.SurfaceTexture surfaceTexture, int i18, int i19, yz5.r rVar, java.util.List list, java.util.List list2, yz5.a aVar, yz5.l lVar, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        boolean z19 = (i27 & 1) != 0 ? false : z17;
        android.content.Intent intent2 = (i27 & 2) != 0 ? null : intent;
        int i28 = (i27 & 4) != 0 ? -1000 : i17;
        boolean z27 = (i27 & 8) != 0 ? true : z18;
        android.graphics.Bitmap bitmap2 = (i27 & 16) != 0 ? null : bitmap;
        long j18 = (i27 & 32) != 0 ? 0L : j17;
        android.graphics.SurfaceTexture surfaceTexture2 = (i27 & 64) != 0 ? null : surfaceTexture;
        int i29 = (i27 & 128) != 0 ? 0 : i18;
        int i37 = (i27 & 256) == 0 ? i19 : 0;
        yz5.r rVar2 = (i27 & 512) == 0 ? rVar : null;
        java.util.List onInnerStartCallback = (i27 & 1024) != 0 ? new java.util.ArrayList() : list;
        java.util.List onInnerStopCallback = (i27 & 2048) != 0 ? new java.util.ArrayList() : list2;
        yz5.a isAppForeground = (i27 & 4096) != 0 ? un0.f.f510883d : aVar;
        yz5.l invokeToStop = (i27 & 8192) != 0 ? un0.g.f510884d : lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onInnerStartCallback, "onInnerStartCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onInnerStopCallback, "onInnerStopCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isAppForeground, "isAppForeground");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeToStop, "invokeToStop");
        this.f510885a = z19;
        this.f510886b = intent2;
        this.f510887c = i28;
        this.f510888d = z27;
        this.f510889e = bitmap2;
        this.f510890f = j18;
        this.f510891g = surfaceTexture2;
        this.f510892h = i29;
        this.f510893i = i37;
        this.f510894j = rVar2;
        this.f510895k = onInnerStartCallback;
        this.f510896l = onInnerStopCallback;
        this.f510897m = isAppForeground;
        this.f510898n = invokeToStop;
    }

    /* renamed from: equals */
    public boolean m168280xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un0.h)) {
            return false;
        }
        un0.h hVar = (un0.h) obj;
        return this.f510885a == hVar.f510885a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f510886b, hVar.f510886b) && this.f510887c == hVar.f510887c && this.f510888d == hVar.f510888d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f510889e, hVar.f510889e) && this.f510890f == hVar.f510890f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f510891g, hVar.f510891g) && this.f510892h == hVar.f510892h && this.f510893i == hVar.f510893i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f510894j, hVar.f510894j) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f510895k, hVar.f510895k) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f510896l, hVar.f510896l) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f510897m, hVar.f510897m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f510898n, hVar.f510898n);
    }

    /* renamed from: hashCode */
    public int m168281x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f510885a) * 31;
        android.content.Intent intent = this.f510886b;
        int hashCode2 = (((((hashCode + (intent == null ? 0 : intent.hashCode())) * 31) + java.lang.Integer.hashCode(this.f510887c)) * 31) + java.lang.Boolean.hashCode(this.f510888d)) * 31;
        android.graphics.Bitmap bitmap = this.f510889e;
        int hashCode3 = (((hashCode2 + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + java.lang.Long.hashCode(this.f510890f)) * 31;
        android.graphics.SurfaceTexture surfaceTexture = this.f510891g;
        int hashCode4 = (((((hashCode3 + (surfaceTexture == null ? 0 : surfaceTexture.hashCode())) * 31) + java.lang.Integer.hashCode(this.f510892h)) * 31) + java.lang.Integer.hashCode(this.f510893i)) * 31;
        yz5.r rVar = this.f510894j;
        return ((((((((hashCode4 + (rVar != null ? rVar.hashCode() : 0)) * 31) + this.f510895k.hashCode()) * 31) + this.f510896l.hashCode()) * 31) + this.f510897m.hashCode()) * 31) + this.f510898n.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m168282x9616526c() {
        return "RecordCommunication(isPermissionResultSuccess=" + this.f510885a + ", permissionResultIntent=" + this.f510886b + ", permissionResultCode=" + this.f510887c + ", isVerticalRecord=" + this.f510888d + ", coverBitmap=" + this.f510889e + ", coverBitmapUpdateTime=" + this.f510890f + ", surfaceTexture=" + this.f510891g + ", width=" + this.f510892h + ", height=" + this.f510893i + ", onAudioFrameAvailable=" + this.f510894j + ", onInnerStartCallback=" + this.f510895k + ", onInnerStopCallback=" + this.f510896l + ", isAppForeground=" + this.f510897m + ", invokeToStop=" + this.f510898n + ')';
    }
}

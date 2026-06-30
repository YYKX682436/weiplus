package el3;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335499e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f335500f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f335501g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f335502h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f335503i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335504m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f335505n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f335506o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f335507p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ el3.h f335508q;

    public d(el3.h hVar, java.lang.String str, java.lang.String str2, long j17, long j18, long j19, boolean z17, java.lang.String str3, long j27, long j28, long j29) {
        this.f335508q = hVar;
        this.f335498d = str;
        this.f335499e = str2;
        this.f335500f = j17;
        this.f335501g = j18;
        this.f335502h = j19;
        this.f335503i = z17;
        this.f335504m = str3;
        this.f335505n = j27;
        this.f335506o = j28;
        this.f335507p = j29;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f335498d + "-" + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(this.f335499e);
        synchronized (el3.h.f335529i) {
            if (el3.h.f335529i.containsKey(str)) {
                el3.h.A(this.f335508q, el3.h.f335531k, str, this.f335500f);
                el3.h.A(this.f335508q, el3.h.f335532l, str, this.f335501g);
                el3.h.A(this.f335508q, el3.h.f335533m, str, this.f335502h);
                int intValue = ((java.lang.Integer) el3.h.f335529i.get(str)).intValue() - 1;
                if (intValue > 0) {
                    el3.h.f335529i.put(str, java.lang.Integer.valueOf(intValue));
                } else {
                    el3.h.f335529i.remove(str);
                }
                if (this.f335503i) {
                    el3.h.f335526f++;
                } else {
                    el3.h.f335521a = 1;
                    el3.h.f335527g++;
                }
            }
            if (el3.h.f335528h.containsKey(str)) {
                int intValue2 = ((java.lang.Integer) el3.h.f335528h.get(str)).intValue() - 1;
                if (intValue2 > 0) {
                    el3.h.f335528h.put(str, java.lang.Integer.valueOf(intValue2));
                } else {
                    el3.h.f335528h.remove(str);
                }
            }
            if (!this.f335503i && !android.text.TextUtils.isEmpty(this.f335504m)) {
                if (el3.h.f335530j.containsKey(this.f335504m)) {
                    el3.f fVar = (el3.f) el3.h.f335530j.get(this.f335504m);
                    if (fVar != null) {
                        fVar.f335514a++;
                    }
                    fVar.f335517d = this.f335505n;
                    fVar.f335516c = this.f335506o;
                    fVar.f335515b = this.f335507p;
                    el3.h.f335530j.put(this.f335504m, fVar);
                } else {
                    el3.f fVar2 = new el3.f(this.f335508q);
                    fVar2.f335514a = 1;
                    fVar2.f335517d = this.f335505n;
                    fVar2.f335516c = this.f335506o;
                    fVar2.f335515b = this.f335507p;
                    el3.h.f335530j.put(this.f335504m, fVar2);
                }
            }
        }
    }
}

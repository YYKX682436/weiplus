package e33;

/* loaded from: classes10.dex */
public class q2 implements rj0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e33.u2 f328973a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f328974b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f328975c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f328976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e33.v2 f328977e;

    public q2(e33.v2 v2Var, e33.u2 u2Var, android.graphics.Bitmap bitmap, java.lang.String str, int i17) {
        this.f328977e = v2Var;
        this.f328973a = u2Var;
        this.f328974b = bitmap;
        this.f328975c = str;
        this.f328976d = i17;
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onImageLoadError */
    public void mo15805x5cb2b166(com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886 c1434xa197a886) {
        rq5.b.a(c1434xa197a886.f4423xa7c470f2);
        if (c1434xa197a886.f4423xa7c470f2 == 4) {
            android.graphics.Bitmap bitmap = this.f328974b;
            e33.v2 v2Var = this.f328977e;
            e33.u2 u2Var = this.f328973a;
            v2Var.q(u2Var, bitmap);
            java.util.HashSet hashSet = v2Var.f329037o;
            java.lang.String str = this.f328975c;
            if (hashSet.contains(str)) {
                return;
            }
            v2Var.f329037o.add(str);
            u2Var.f329017b.setTag(u2Var);
            v2Var.B.b(u2Var.f329017b, str, this.f328976d);
        }
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onImageLoaded */
    public void mo15806x91f79de1(android.graphics.Bitmap bitmap) {
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onPreviewLoadError */
    public void mo15807xaf7fedd9(com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886 c1434xa197a886) {
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onPreviewLoaded */
    public void mo15808x3c79ee4e() {
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onPreviewReleased */
    public void mo15809x76d22946() {
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onReady */
    public void mo15810xb03baf04() {
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onTileLoadError */
    public void mo15811x68961215(com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886 c1434xa197a886) {
    }
}

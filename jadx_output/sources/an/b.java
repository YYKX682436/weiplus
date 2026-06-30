package an;

/* loaded from: classes15.dex */
public class b implements com.tencent.wechat.aff.cara.CaraNativeContactBase {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f8822a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8823b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8824c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8825d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8826e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8827f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8828g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f8829h;

    @Override // com.tencent.wechat.aff.cara.CaraNativeContactBase
    public java.lang.String getDisplayName() {
        return this.f8829h;
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeContactBase
    public boolean isGroup() {
        return this.f8824c;
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeContactBase
    public boolean isMinimized() {
        return this.f8827f;
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeContactBase
    public boolean isMute() {
        return this.f8826e;
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeContactBase
    public boolean isOpenIM() {
        return this.f8825d;
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeContactBase
    public boolean isPrivate() {
        return this.f8823b;
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeContactBase
    public boolean isSessionStickyOnTop() {
        return this.f8828g;
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeContactBase
    public java.lang.String username() {
        return this.f8822a;
    }
}

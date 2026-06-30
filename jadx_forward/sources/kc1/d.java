package kc1;

/* loaded from: classes14.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f387815a;

    /* renamed from: b, reason: collision with root package name */
    public final float f387816b;

    /* renamed from: c, reason: collision with root package name */
    public final float f387817c;

    /* renamed from: d, reason: collision with root package name */
    public final float f387818d;

    public d(kc1.f fVar, android.graphics.RectF rectF) {
        this.f387815a = rectF.centerX() - (rectF.width() / 2.0f);
        this.f387816b = rectF.centerY() - (rectF.height() / 2.0f);
        this.f387817c = rectF.width();
        this.f387818d = rectF.height();
    }

    public d(kc1.f fVar, float f17, float f18, float f19, float f27) {
        this.f387815a = f17;
        this.f387816b = f18;
        this.f387817c = f19;
        this.f387818d = f27;
    }
}

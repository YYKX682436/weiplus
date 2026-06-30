package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class HandleBoxSettings {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f48383a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.base.Vec2 f48384b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.maas.base.Vec2 f48385c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.maas.base.Vec2 f48386d;

    /* renamed from: e, reason: collision with root package name */
    public final float f48387e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.maas.model.MJEdgeInsets f48388f;

    /* renamed from: g, reason: collision with root package name */
    public final int f48389g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f48390h;

    private HandleBoxSettings(boolean z17, com.tencent.maas.base.Vec2 vec2, com.tencent.maas.base.Vec2 vec22, com.tencent.maas.base.Vec2 vec23, float f17, com.tencent.maas.model.MJEdgeInsets mJEdgeInsets, int i17, boolean z18) {
        this.f48383a = z17;
        this.f48384b = vec2;
        this.f48385c = vec22;
        this.f48386d = vec23;
        this.f48387e = f17;
        this.f48388f = mJEdgeInsets;
        this.f48389g = i17;
        this.f48390h = z18;
    }

    public java.lang.String toString() {
        return "HandleBoxSettings{isVisible=" + this.f48383a + ", contentSize=" + this.f48384b + ", position=" + this.f48385c + ", scale=" + this.f48386d + ", rotation=" + this.f48387e + ", edgeInsets=" + this.f48388f + ", enabledButtonIDBits=" + this.f48389g + ", isNormalized=" + this.f48390h + '}';
    }
}

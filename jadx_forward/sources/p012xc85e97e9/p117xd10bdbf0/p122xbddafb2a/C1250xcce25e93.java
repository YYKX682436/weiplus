package p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Landroidx/window/layout/WindowMetrics;", "", "bounds", "Landroid/graphics/Rect;", "(Landroid/graphics/Rect;)V", "_bounds", "Landroidx/window/core/Bounds;", "(Landroidx/window/core/Bounds;)V", "getBounds", "()Landroid/graphics/Rect;", "equals", "", "other", "hashCode", "", "toString", "", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: androidx.window.layout.WindowMetrics */
/* loaded from: classes13.dex */
public final class C1250xcce25e93 {
    private final p012xc85e97e9.p117xd10bdbf0.p118x2eaf9f.C1195x76f2e2d5 _bounds;

    public C1250xcce25e93(p012xc85e97e9.p117xd10bdbf0.p118x2eaf9f.C1195x76f2e2d5 _bounds) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(_bounds, "_bounds");
        this._bounds = _bounds;
    }

    /* renamed from: equals */
    public boolean m8637xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1250xcce25e93.class, other.getClass())) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this._bounds, ((p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1250xcce25e93) other)._bounds);
    }

    /* renamed from: getBounds */
    public final android.graphics.Rect m8638x12a519ab() {
        return this._bounds.m8367xcc3526ff();
    }

    /* renamed from: hashCode */
    public int m8639x8cdac1b() {
        return this._bounds.m8364x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m8640x9616526c() {
        return "WindowMetrics { bounds: " + m8638x12a519ab() + " }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1250xcce25e93(android.graphics.Rect bounds) {
        this(new p012xc85e97e9.p117xd10bdbf0.p118x2eaf9f.C1195x76f2e2d5(bounds));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bounds, "bounds");
    }
}

package p012xc85e97e9.p117xd10bdbf0.p118x2eaf9f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B%\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\u0013\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\u0006\u0010\u001b\u001a\u00020\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\fR\u0011\u0010\u0016\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\f¨\u0006\u001e"}, d2 = {"Landroidx/window/core/Bounds;", "", "rect", "Landroid/graphics/Rect;", "(Landroid/graphics/Rect;)V", "left", "", "top", "right", "bottom", "(IIII)V", "getBottom", "()I", "height", "getHeight", "isEmpty", "", "()Z", "isZero", "getLeft", "getRight", "getTop", "width", "getWidth", "equals", "other", "hashCode", "toRect", "toString", "", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: androidx.window.core.Bounds */
/* loaded from: classes13.dex */
public final class C1195x76f2e2d5 {
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public C1195x76f2e2d5(int i17, int i18, int i19, int i27) {
        this.left = i17;
        this.top = i18;
        this.right = i19;
        this.bottom = i27;
    }

    /* renamed from: equals */
    public boolean m8357xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p012xc85e97e9.p117xd10bdbf0.p118x2eaf9f.C1195x76f2e2d5.class, other == null ? null : other.getClass())) {
            return false;
        }
        if (other == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
        }
        p012xc85e97e9.p117xd10bdbf0.p118x2eaf9f.C1195x76f2e2d5 c1195x76f2e2d5 = (p012xc85e97e9.p117xd10bdbf0.p118x2eaf9f.C1195x76f2e2d5) other;
        return this.left == c1195x76f2e2d5.left && this.top == c1195x76f2e2d5.top && this.right == c1195x76f2e2d5.right && this.bottom == c1195x76f2e2d5.bottom;
    }

    public final int getBottom() {
        return this.bottom;
    }

    /* renamed from: getHeight */
    public final int m8359x1c4fb41d() {
        return this.bottom - this.top;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    /* renamed from: getWidth */
    public final int m8363x755bd410() {
        return this.right - this.left;
    }

    /* renamed from: hashCode */
    public int m8364x8cdac1b() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    /* renamed from: isEmpty */
    public final boolean m8365x7aab3243() {
        return m8359x1c4fb41d() == 0 || m8363x755bd410() == 0;
    }

    /* renamed from: isZero */
    public final boolean m8366xb9abdaf2() {
        return m8359x1c4fb41d() == 0 && m8363x755bd410() == 0;
    }

    /* renamed from: toRect */
    public final android.graphics.Rect m8367xcc3526ff() {
        return new android.graphics.Rect(this.left, this.top, this.right, this.bottom);
    }

    /* renamed from: toString */
    public java.lang.String m8368x9616526c() {
        return "Bounds { [" + this.left + ',' + this.top + ',' + this.right + ',' + this.bottom + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1195x76f2e2d5(android.graphics.Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
    }
}

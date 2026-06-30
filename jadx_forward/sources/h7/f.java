package h7;

/* loaded from: classes13.dex */
public class f extends android.graphics.drawable.Drawable implements h7.k, android.graphics.drawable.Animatable {

    /* renamed from: d, reason: collision with root package name */
    public final h7.e f360866d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f360867e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f360868f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f360869g;

    /* renamed from: i, reason: collision with root package name */
    public int f360871i;

    /* renamed from: n, reason: collision with root package name */
    public boolean f360873n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Paint f360874o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Rect f360875p;

    /* renamed from: h, reason: collision with root package name */
    public boolean f360870h = true;

    /* renamed from: m, reason: collision with root package name */
    public final int f360872m = -1;

    public f(h7.e eVar) {
        q7.n.b(eVar);
        this.f360866d = eVar;
    }

    public final void a() {
        q7.n.a(!this.f360869g, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        h7.m mVar = this.f360866d.f360865a;
        if (((s6.f) mVar.f360882a).f484837l.f484813c == 1) {
            invalidateSelf();
            return;
        }
        if (this.f360867e) {
            return;
        }
        this.f360867e = true;
        if (mVar.f360891j) {
            throw new java.lang.IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) mVar.f360884c;
        if (arrayList.contains(this)) {
            throw new java.lang.IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (isEmpty && !mVar.f360887f) {
            mVar.f360887f = true;
            mVar.f360891j = false;
            mVar.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (this.f360869g) {
            return;
        }
        if (this.f360873n) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            android.graphics.Rect bounds = getBounds();
            if (this.f360875p == null) {
                this.f360875p = new android.graphics.Rect();
            }
            android.view.Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f360875p);
            this.f360873n = false;
        }
        h7.m mVar = this.f360866d.f360865a;
        h7.j jVar = mVar.f360890i;
        android.graphics.Bitmap bitmap = jVar != null ? jVar.f360880m : mVar.f360893l;
        if (this.f360875p == null) {
            this.f360875p = new android.graphics.Rect();
        }
        android.graphics.Rect rect = this.f360875p;
        if (this.f360874o == null) {
            this.f360874o = new android.graphics.Paint(2);
        }
        canvas.drawBitmap(bitmap, (android.graphics.Rect) null, rect, this.f360874o);
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return this.f360866d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f360866d.f360865a.f360897p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f360866d.f360865a.f360896o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f360867e;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        this.f360873n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        if (this.f360874o == null) {
            this.f360874o = new android.graphics.Paint(2);
        }
        this.f360874o.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        if (this.f360874o == null) {
            this.f360874o = new android.graphics.Paint(2);
        }
        this.f360874o.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z17, boolean z18) {
        q7.n.a(!this.f360869g, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f360870h = z17;
        if (!z17) {
            this.f360867e = false;
            h7.m mVar = this.f360866d.f360865a;
            java.util.ArrayList arrayList = (java.util.ArrayList) mVar.f360884c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                mVar.f360887f = false;
            }
        } else if (this.f360868f) {
            a();
        }
        return super.setVisible(z17, z18);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f360868f = true;
        this.f360871i = 0;
        if (this.f360870h) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f360868f = false;
        this.f360867e = false;
        h7.m mVar = this.f360866d.f360865a;
        java.util.ArrayList arrayList = (java.util.ArrayList) mVar.f360884c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            mVar.f360887f = false;
        }
    }
}

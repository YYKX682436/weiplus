package bn5;

/* loaded from: classes10.dex */
public class n extends bn5.f {
    @Override // bn5.f
    public boolean f() {
        return false;
    }

    @Override // bn5.f
    /* renamed from: getAliveRect */
    public android.graphics.Rect mo10933x81daa99b() {
        return super.mo10933x81daa99b().isEmpty() ? m10934x9faf4b34() : super.mo10933x81daa99b();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        canvas.drawColor(0);
        canvas.setMatrix(this.f104474e);
        ((l45.n) m10945xc879b3f2()).q(canvas);
    }
}

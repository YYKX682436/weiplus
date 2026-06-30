package bn5;

/* loaded from: classes10.dex */
public class n extends bn5.f {
    @Override // bn5.f
    public boolean f() {
        return false;
    }

    @Override // bn5.f
    public android.graphics.Rect getAliveRect() {
        return super.getAliveRect().isEmpty() ? getBoardRect() : super.getAliveRect();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        canvas.drawColor(0);
        canvas.setMatrix(this.f22941e);
        ((l45.n) getPresenter()).q(canvas);
    }
}

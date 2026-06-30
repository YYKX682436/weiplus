package fh4;

/* loaded from: classes15.dex */
public class c0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh4.d0 f344203d;

    public c0(fh4.d0 d0Var) {
        this.f344203d = d0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        android.graphics.Canvas lockCanvas;
        float[] fArr;
        fh4.d0 d0Var = this.f344203d;
        float f17 = d0Var.f344219u;
        if (f17 >= d0Var.f344206e && f17 <= d0Var.f344207f && d0Var.f344210i != null && d0Var.f344209h != null && (lockCanvas = d0Var.f344208g.lockCanvas()) != null && d0Var.f344213o != null) {
            lockCanvas.setDrawFilter(d0Var.f344220v);
            float f18 = d0Var.f344219u;
            if (d0Var.f344223y == null) {
                float f19 = d0Var.f344207f;
                d0Var.f344223y = new float[]{f19, f19, f19, f19, f19};
            }
            int i17 = 0;
            while (true) {
                fArr = d0Var.f344223y;
                if (i17 >= fArr.length - 1) {
                    break;
                }
                int i18 = i17 + 1;
                fArr[i17] = fArr[i18];
                i17 = i18;
            }
            fArr[i17] = f18;
            float f27 = ((((fArr[0] + (fArr[1] * 4.0f)) + (fArr[2] * 6.0f)) + (fArr[3] * 4.0f)) + (fArr[4] * 1.0f)) / 16.0f;
            d0Var.f344218t = f27;
            int i19 = (int) f27;
            d0Var.f344213o.set(0, i19, d0Var.f344215q, d0Var.f344214p + i19);
            lockCanvas.drawBitmap(d0Var.f344221w ? d0Var.f344210i : d0Var.f344209h, (android.graphics.Rect) null, d0Var.f344213o, d0Var.f344212n);
            d0Var.f344208g.unlockCanvasAndPost(lockCanvas);
        }
        return d0Var.f344217s;
    }
}

package xz3;

/* loaded from: classes15.dex */
public final class e implements xz3.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xz3.f f539747a;

    public e(xz3.f fVar) {
        this.f539747a = fVar;
    }

    @Override // xz3.k
    public void b(xz3.l task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        xz3.f fVar = this.f539747a;
        fVar.f539749e.b(fVar);
    }

    @Override // xz3.m
    public void c(sz3.x0 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageGetProductTask", "getProductTask onUploadSuccess and run imageRetrievalTask");
        xz3.f fVar = this.f539747a;
        fVar.f539749e.c(result);
        if (result.f495682c == 1) {
            if (fVar.f539748d.f495622k) {
                xz3.f.a(fVar, result);
                return;
            } else {
                fVar.f539749e.j(fVar);
                return;
            }
        }
        if (!fVar.f539748d.f495623l) {
            fVar.f539749e.j(fVar);
            return;
        }
        sz3.w0 w0Var = (sz3.w0) kz5.n0.Z(result.f495684e);
        android.graphics.RectF rectF = w0Var != null ? w0Var.f495673k : null;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (rectF == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AiScanImageGetProductTask", "getProductTask uploadFullImage success but no goodsObject");
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.o(false);
            fVar.f539749e.d(result, result.f495680a, result.f495681b, 4, -1, "upload full image no goodsObject");
            fVar.f539749e.j(fVar);
            return;
        }
        vz3.t tVar = vz3.t.f523243a;
        sz3.p pVar = fVar.f539748d;
        int i17 = pVar.f495624m;
        sz3.a1 a1Var = pVar.f495478b;
        byte[] bArr = pVar.f495625n;
        android.graphics.Point point = pVar.f495626o;
        tVar.e(i17, a1Var, result, rectF, bArr, point.x, point.y, new xz3.d(fVar, result));
    }

    @Override // xz3.m
    public void d(sz3.x0 result, int i17, long j17, int i18, int i19, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        xz3.f fVar = this.f539747a;
        fVar.f539749e.d(result, i17, j17, i18, i19, str);
        fVar.f539749e.j(fVar);
        if (result.f495682c == 1) {
            if (!(result.f495683d == 1002)) {
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.o(false);
    }

    @Override // xz3.m
    public void e(sz3.p request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        this.f539747a.f539749e.e(request);
    }

    @Override // xz3.k
    public void g(xz3.l task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        xz3.f fVar = this.f539747a;
        fVar.f539749e.g(fVar);
    }

    @Override // xz3.k
    public void j(xz3.l task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
    }
}

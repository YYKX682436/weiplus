package ts0;

/* loaded from: classes10.dex */
public final class m extends ts0.l {
    public final java.lang.String M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.M = "CommonCamera1ForFinderLive";
    }

    @Override // ts0.b
    public boolean I(int i17) {
        di3.s sVar;
        di3.g0 g0Var = this.f503062k;
        java.lang.String str = this.M;
        try {
            boolean D = D();
            android.graphics.Point E = E();
            android.util.Size[] F = F();
            if (F == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "preview size null!!");
                return false;
            }
            try {
                sVar = di3.t.d(F, E, i17, D);
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "selectNoCropPreviewSize fail resolutionLimit:" + i17 + "!!");
                sVar = new di3.s();
            }
            if (sVar.f314290a == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "preview size still null!!");
                sVar = di3.t.i(F, new android.graphics.Point(java.lang.Math.min(E.x, E.y), java.lang.Math.max(E.x, E.y)), this.f503055d, D);
            }
            if (sVar.f314290a == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkMore start %s", sVar.m124459x9616526c());
                sVar.f314290a = sVar.f314293d;
                sVar.f314291b = sVar.f314294e;
                sVar.f314292c = sVar.f314295f;
            }
            android.graphics.Point point = sVar.f314290a;
            android.util.Size size = new android.util.Size(point.x, point.y);
            g0Var.f314244c = size.getWidth();
            g0Var.f314243b = size.getHeight();
            android.graphics.Point point2 = sVar.f314292c;
            if (point2 != null) {
                this.f503070s = point2;
            }
            J(size.getWidth(), size.getHeight());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "final set camera preview size: " + size + ", cropSize: " + this.f503070s);
            return true;
        } catch (android.hardware.camera2.CameraAccessException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "selectNoCropPreviewSize Exception by camera access exception, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
            return false;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e18, "selectNoCropPreviewSize Exception, %s, %s", android.os.Looper.myLooper(), e18.getMessage());
            return false;
        }
    }
}

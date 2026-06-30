package dr5;

/* loaded from: classes15.dex */
public abstract class c {
    public static android.graphics.Matrix a(android.graphics.Matrix applyTransform, zq5.v transform, long j17, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(applyTransform, "$this$applyTransform");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transform, "transform");
        if (z17) {
            applyTransform.reset();
        }
        long j18 = transform.f556632e;
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j18 >> 32));
        int i18 = zq5.g.f556599c;
        float f17 = (int) (j17 >> 32);
        applyTransform.postRotate(transform.f556630c, intBitsToFloat * f17, java.lang.Float.intBitsToFloat((int) (j18 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2)) * zq5.g.b(j17));
        long j19 = transform.f556628a;
        float b17 = zq5.q.b(j19);
        float c17 = zq5.q.c(j19);
        long j27 = transform.f556631d;
        applyTransform.postScale(b17, c17, java.lang.Float.intBitsToFloat((int) (j27 >> 32)) * f17, java.lang.Float.intBitsToFloat((int) (j27 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2)) * zq5.g.b(j17));
        long j28 = transform.f556629b;
        applyTransform.postTranslate(zq5.l.b(j28), zq5.l.c(j28));
        return applyTransform;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final p012xc85e97e9.p093xedfae76a.o b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "<this>");
        if (context instanceof p012xc85e97e9.p093xedfae76a.y) {
            return ((p012xc85e97e9.p093xedfae76a.y) context).mo273xed6858b4();
        }
        if (!(context instanceof android.content.ContextWrapper)) {
            return null;
        }
        android.content.Context baseContext = ((android.content.ContextWrapper) context).getBaseContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(baseContext, "getBaseContext(...)");
        return b(baseContext);
    }

    public static final gr5.b c(android.widget.ImageView.ScaleType scaleType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scaleType, "<this>");
        int i17 = dr5.b.f324304a[scaleType.ordinal()];
        gr5.b bVar = gr5.a.f356432a;
        gr5.b bVar2 = gr5.a.f356436e;
        switch (i17) {
            case 1:
                int i18 = gr5.b.f356442a;
                return bVar;
            case 2:
                int i19 = gr5.b.f356442a;
                return bVar;
            case 3:
                int i27 = gr5.b.f356442a;
                return bVar;
            case 4:
                int i28 = gr5.b.f356442a;
                break;
            case 5:
                int i29 = gr5.b.f356442a;
                return gr5.a.f356440i;
            case 6:
                int i37 = gr5.b.f356442a;
                break;
            case 7:
                int i38 = gr5.b.f356442a;
                break;
            case 8:
                int i39 = gr5.b.f356442a;
                break;
            default:
                throw new jz5.j();
        }
        return bVar2;
    }

    public static final gr5.n d(android.widget.ImageView.ScaleType scaleType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scaleType, "<this>");
        int i17 = dr5.b.f324304a[scaleType.ordinal()];
        gr5.w wVar = gr5.m.f356472f;
        gr5.n nVar = gr5.m.f356468b;
        switch (i17) {
            case 1:
                int i18 = gr5.n.f356474a;
                return wVar;
            case 2:
                int i19 = gr5.n.f356474a;
                return gr5.m.f356473g;
            case 3:
                int i27 = gr5.n.f356474a;
                break;
            case 4:
                int i28 = gr5.n.f356474a;
                break;
            case 5:
                int i29 = gr5.n.f356474a;
                break;
            case 6:
                int i37 = gr5.n.f356474a;
                return wVar;
            case 7:
                int i38 = gr5.n.f356474a;
                return gr5.m.f356467a;
            case 8:
                int i39 = gr5.n.f356474a;
                return gr5.m.f356471e;
            default:
                throw new jz5.j();
        }
        return nVar;
    }
}

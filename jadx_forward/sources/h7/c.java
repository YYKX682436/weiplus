package h7;

/* loaded from: classes13.dex */
public class c implements t6.n {

    /* renamed from: f, reason: collision with root package name */
    public static final h7.a f360856f = new h7.a();

    /* renamed from: g, reason: collision with root package name */
    public static final h7.b f360857g = new h7.b();

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f360858a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f360859b;

    /* renamed from: c, reason: collision with root package name */
    public final h7.b f360860c;

    /* renamed from: d, reason: collision with root package name */
    public final h7.a f360861d;

    /* renamed from: e, reason: collision with root package name */
    public final h7.d f360862e;

    public c(android.content.Context context, java.util.List list, x6.d dVar, x6.b bVar) {
        h7.a aVar = f360856f;
        this.f360858a = context.getApplicationContext();
        this.f360859b = list;
        this.f360861d = aVar;
        this.f360862e = new h7.d(dVar, bVar);
        this.f360860c = f360857g;
    }

    @Override // t6.n
    public w6.z0 a(java.lang.Object obj, int i17, int i18, t6.l lVar) {
        s6.e eVar;
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
        h7.b bVar = this.f360860c;
        synchronized (bVar) {
            s6.e eVar2 = (s6.e) ((java.util.ArrayDeque) bVar.f360855a).poll();
            if (eVar2 == null) {
                eVar2 = new s6.e();
            }
            eVar = eVar2;
            eVar.f484823b = null;
            java.util.Arrays.fill(eVar.f484822a, (byte) 0);
            eVar.f484824c = new s6.d();
            eVar.f484825d = 0;
            java.nio.ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            eVar.f484823b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            eVar.f484823b.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        }
        try {
            h7.h c17 = c(byteBuffer, i17, i18, eVar, lVar);
            h7.b bVar2 = this.f360860c;
            synchronized (bVar2) {
                eVar.f484823b = null;
                eVar.f484824c = null;
                ((java.util.ArrayDeque) bVar2.f360855a).offer(eVar);
            }
            return c17;
        } catch (java.lang.Throwable th6) {
            h7.b bVar3 = this.f360860c;
            synchronized (bVar3) {
                eVar.f484823b = null;
                eVar.f484824c = null;
                ((java.util.ArrayDeque) bVar3.f360855a).offer(eVar);
                throw th6;
            }
        }
    }

    @Override // t6.n
    public boolean b(java.lang.Object obj, t6.l lVar) {
        com.p147xb1cd08cc.p148x5de23a5.p149x32c4e6.EnumC1427x7be2d498 enumC1427x7be2d498;
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
        if (((java.lang.Boolean) lVar.c(h7.o.f360900b)).booleanValue()) {
            return false;
        }
        if (byteBuffer == null) {
            enumC1427x7be2d498 = com.p147xb1cd08cc.p148x5de23a5.p149x32c4e6.EnumC1427x7be2d498.UNKNOWN;
        } else {
            java.util.List list = this.f360859b;
            int size = list.size();
            int i17 = 0;
            while (true) {
                if (i17 >= size) {
                    enumC1427x7be2d498 = com.p147xb1cd08cc.p148x5de23a5.p149x32c4e6.EnumC1427x7be2d498.UNKNOWN;
                    break;
                }
                com.p147xb1cd08cc.p148x5de23a5.p149x32c4e6.EnumC1427x7be2d498 b17 = ((t6.f) list.get(i17)).b(byteBuffer);
                if (b17 != com.p147xb1cd08cc.p148x5de23a5.p149x32c4e6.EnumC1427x7be2d498.UNKNOWN) {
                    enumC1427x7be2d498 = b17;
                    break;
                }
                i17++;
            }
        }
        return enumC1427x7be2d498 == com.p147xb1cd08cc.p148x5de23a5.p149x32c4e6.EnumC1427x7be2d498.GIF;
    }

    public final h7.h c(java.nio.ByteBuffer byteBuffer, int i17, int i18, s6.e eVar, t6.l lVar) {
        int i19 = q7.j.f441834b;
        long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
        try {
            s6.d b17 = eVar.b();
            if (b17.f484813c > 0 && b17.f484812b == 0) {
                android.graphics.Bitmap.Config config = lVar.c(h7.o.f360899a) == t6.b.PREFER_RGB_565 ? android.graphics.Bitmap.Config.RGB_565 : android.graphics.Bitmap.Config.ARGB_8888;
                int min = java.lang.Math.min(b17.f484817g / i18, b17.f484816f / i17);
                int max = java.lang.Math.max(1, min == 0 ? 0 : java.lang.Integer.highestOneBit(min));
                android.util.Log.isLoggable("BufferGifDecoder", 2);
                h7.a aVar = this.f360861d;
                h7.d dVar = this.f360862e;
                aVar.getClass();
                s6.f fVar = new s6.f(dVar, b17, byteBuffer, max);
                fVar.c(config);
                fVar.f484836k = (fVar.f484836k + 1) % fVar.f484837l.f484813c;
                android.graphics.Bitmap b18 = fVar.b();
                if (b18 == null) {
                    return null;
                }
                h7.h hVar = new h7.h(new h7.f(new h7.e(new h7.m(com.p147xb1cd08cc.p148x5de23a5.c.b(this.f360858a), fVar, i17, i18, (c7.e) c7.e.f121051b, b18))));
                if (android.util.Log.isLoggable("BufferGifDecoder", 2)) {
                    q7.j.a(elapsedRealtimeNanos);
                }
                return hVar;
            }
            if (android.util.Log.isLoggable("BufferGifDecoder", 2)) {
                q7.j.a(elapsedRealtimeNanos);
            }
            return null;
        } finally {
            if (android.util.Log.isLoggable("BufferGifDecoder", 2)) {
                q7.j.a(elapsedRealtimeNanos);
            }
        }
    }
}

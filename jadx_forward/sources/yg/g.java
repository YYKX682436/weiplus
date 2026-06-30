package yg;

/* loaded from: classes7.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yg.h f543593d;

    public g(yg.h hVar, yg.e eVar) {
        this.f543593d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        yg.h hVar = this.f543593d;
        synchronized (hVar.f543597a) {
            if (hVar.f543597a.f130110a != 0) {
                com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83 = hVar.f543597a;
                float[] m34764x50e3edcf = abstractC4208x204d5c83.m34764x50e3edcf(abstractC4208x204d5c83.f130110a);
                yg.a aVar = hVar.f543599c;
                float f17 = m34764x50e3edcf[0];
                aVar.f543551a = f17;
                aVar.f543552b = m34764x50e3edcf[1];
                int i17 = (int) m34764x50e3edcf[2];
                aVar.f543553c = i17;
                int i18 = (int) m34764x50e3edcf[3];
                aVar.f543554d = i18;
                aVar.f543555e = m34764x50e3edcf[4];
                int i19 = (int) m34764x50e3edcf[5];
                aVar.f543556f = i19;
                int i27 = (int) m34764x50e3edcf[6];
                aVar.f543557g = i27;
                yg.f fVar = hVar.f543611o;
                fVar.f543583c += i17;
                fVar.f543584d += i18;
                fVar.f543586f += i19;
                fVar.f543587g += i27;
                if (hVar.f543607k) {
                    int i28 = hVar.f543608l + 1;
                    hVar.f543608l = i28;
                    if (i28 > hVar.f543609m) {
                        hVar.f543608l = 1;
                        if (hVar.f543610n) {
                            fVar.f543582b = 0;
                            fVar.f543581a = 0;
                        }
                    }
                    if (f17 < hVar.f543604h) {
                        fVar.f543582b++;
                    }
                    int size = ((java.util.LinkedList) hVar.f543605i).size();
                    int i29 = hVar.f543602f;
                    if (size >= i29 && i29 > 0) {
                        float f18 = (hVar.f543599c.f543551a * i29) + hVar.f543603g;
                        float f19 = hVar.f543606j;
                        if (f18 < f19) {
                            hVar.f543611o.f543581a++;
                        }
                        hVar.f543606j = f19 - ((java.lang.Float) ((java.util.LinkedList) hVar.f543605i).remove()).floatValue();
                    }
                    ((java.util.LinkedList) hVar.f543605i).add(java.lang.Float.valueOf(hVar.f543599c.f543551a));
                    hVar.f543606j += hVar.f543599c.f543551a;
                }
            }
        }
        yg.h hVar2 = this.f543593d;
        android.os.Handler handler = hVar2.f543600d;
        if (handler != null) {
            handler.postDelayed(hVar2.f543601e, 1000L);
        }
    }
}

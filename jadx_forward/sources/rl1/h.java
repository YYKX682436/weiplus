package rl1;

/* loaded from: classes13.dex */
public class h {
    public rl1.g a(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26) {
        double m37196x79d7af9 = (c4406x873d1d26.m37196x79d7af9() / 360.0d) + 0.5d;
        double sin = java.lang.Math.sin(java.lang.Math.toRadians(c4406x873d1d26.m37195x2605e9e2()));
        return new rl1.g(m37196x79d7af9 * 4.007501668557849E7d, (((java.lang.Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d) * 4.007501668557849E7d);
    }
}

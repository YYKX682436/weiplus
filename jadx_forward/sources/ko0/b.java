package ko0;

/* loaded from: classes10.dex */
public final class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ko0.b f391352a = new ko0.b();

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String sb6;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        ko0.c.f391356c = false;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("GetCdnIpReq errType:");
        sb7.append(fVar.f152148a);
        sb7.append(", errCode:");
        sb7.append(fVar.f152149b);
        sb7.append(",errMsg:");
        sb7.append(fVar.f152150c);
        sb7.append(',');
        java.util.LinkedList<r45.ev> m75941xfb821914 = ((r45.xr1) fVar.f152151d).m75941xfb821914(1);
        if (m75941xfb821914 == null || m75941xfb821914.isEmpty()) {
            sb6 = "[NULL]";
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            for (r45.ev evVar : m75941xfb821914) {
                sb8.append("[");
                sb8.append(evVar.m75945x2fec8307(0));
                sb8.append(":");
                sb8.append(evVar.m75941xfb821914(1));
                sb8.append("]");
            }
            sb6 = sb8.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sb6);
        }
        sb7.append(sb6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveBackUpUtil", sb7.toString());
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            ko0.c cVar = ko0.c.f391354a;
            ko0.c.f391355b = ((r45.xr1) fVar.f152151d).m75941xfb821914(1);
        } else if (fVar.f152149b == -200291) {
            ko0.c.f391357d = true;
        }
        return jz5.f0.f384359a;
    }
}

package vk;

@j95.b
/* loaded from: classes13.dex */
public final class p extends i95.w implements ob0.j3 {
    public java.lang.String wi(int i17, boolean z17) {
        java.lang.String name;
        int lastIndexOf;
        if (i17 == 1001) {
            name = iq.d.class.getName();
        } else if (i17 != 1002) {
            switch (i17) {
                case 1:
                    name = k5.l.class.getName();
                    break;
                case 2:
                    name = m5.c.class.getName();
                    break;
                case 3:
                    name = b5.h.class.getName();
                    break;
                case 4:
                    name = b5.w.class.getName();
                    break;
                case 5:
                    name = nz5.b.class.getName();
                    break;
                case 6:
                    name = p3325xe03a0797.p3326xc267989b.d1.class.getName();
                    break;
                case 7:
                    name = p3325xe03a0797.p3326xc267989b.c2.class.getName();
                    break;
                case 8:
                    name = p3325xe03a0797.p3326xc267989b.b2.class.getName();
                    break;
                case 9:
                    name = p3325xe03a0797.p3326xc267989b.h1.class.getName();
                    break;
                case 10:
                    name = p3325xe03a0797.p3326xc267989b.a4.class.getName();
                    break;
                case 11:
                    name = pu5.f.class.getName();
                    break;
                case 12:
                    name = com.p314xaae8f345.cso.C2941xefde02d2.class.getName();
                    break;
                case 13:
                    name = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.AbstractApplicationC26612x4766a891.class.getName();
                    break;
                default:
                    throw new java.lang.IllegalStateException("Unknown retrace placeholder: " + i17);
            }
        } else {
            name = gl.y.class.getName();
        }
        return (!z17 || (lastIndexOf = name.lastIndexOf(".")) < 0) ? name : name.substring(0, lastIndexOf + 1);
    }
}

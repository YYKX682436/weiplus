package p3380x6a61f93.p3386xf51b86f1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J \u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0007JC\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013JC\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0013¨\u0006\u0019"}, d2 = {"Lurgen/ur_C563/URS_4700;", "", "", "kvId", "", "value", "Ljz5/f0;", "UR_D37D", "key", "UR_F63A", "eventId", "", "routeRule", "", "isRtReport", "", "keyArr", "valueArr", "UR_52D0", "(Ljava/lang/String;JZ[Ljava/lang/String;[Ljava/lang/String;)V", "bizId", "isBatchReport", "UR_AA7A", "<init>", "()V", "plugin-ilink_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: urgen.ur_C563.URS_4700 */
/* loaded from: classes.dex */
public final class C30581x2784d0c {

    /* renamed from: INSTANCE */
    public static final p3380x6a61f93.p3386xf51b86f1.C30581x2784d0c f77178x4fbc8495 = new p3380x6a61f93.p3386xf51b86f1.C30581x2784d0c();

    private C30581x2784d0c() {
    }

    /* renamed from: UR_52D0 */
    public static final void m170054x21b2a42b(java.lang.String eventId, long routeRule, boolean isRtReport, java.lang.String[] keyArr, java.lang.String[] valueArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyArr, "keyArr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueArr, "valueArr");
        if (eventId.length() == 0) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (keyArr.length == valueArr.length) {
            int length = keyArr.length;
            for (int i17 = 0; i17 < length; i17++) {
                hashMap.put(keyArr[i17], valueArr[i17]);
            }
        }
        int i18 = (int) routeRule;
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        if (aVar.oj()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(java.lang.Integer.valueOf(i18));
            aVar.Dj(eventId, null, hashMap, 0, arrayList, isRtReport, false, false);
        }
    }

    /* renamed from: UR_AA7A */
    public static final void m170055x21b84f6c(java.lang.String eventId, long bizId, boolean isBatchReport, java.lang.String[] keyArr, java.lang.String[] valueArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyArr, "keyArr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueArr, "valueArr");
        if (eventId.length() == 0) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (keyArr.length == valueArr.length) {
            int length = keyArr.length;
            for (int i17 = 0; i17 < length; i17++) {
                hashMap.put(keyArr[i17], valueArr[i17]);
            }
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj(eventId, null, hashMap, (int) bizId, isBatchReport);
    }

    /* renamed from: UR_D37D */
    public static final void m170056x21b977fe(int i17, java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        jx3.f.INSTANCE.mo68478xbd3cda5f(i17, value);
    }

    /* renamed from: UR_F63A */
    public static final void m170057x21ba6b80(int i17, int i18, int i19) {
        jx3.f.INSTANCE.w(i17, i18, i19);
    }
}

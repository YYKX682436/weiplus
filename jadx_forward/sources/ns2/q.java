package ns2;

/* loaded from: classes2.dex */
public final class q extends ns2.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Integer f420951d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 r12, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 r13, java.lang.Integer r14, java.util.List r15, java.lang.String r16, int r17, p3321xbce91901.jvm.p3324x21ffc6bd.i r18) {
        /*
            r11 = this;
            r0 = r17 & 4
            r1 = 0
            if (r0 == 0) goto L7
            r0 = r1
            goto L8
        L7:
            r0 = r14
        L8:
            r2 = r17 & 8
            if (r2 == 0) goto Le
            r6 = r1
            goto Lf
        Le:
            r6 = r15
        Lf:
            r1 = r17 & 16
            if (r1 == 0) goto L17
            java.lang.String r1 = ""
            r8 = r1
            goto L19
        L17:
            r8 = r16
        L19:
            java.lang.String r1 = "activity"
            r2 = r12
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r1)
            java.lang.String r1 = "name"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r1)
            r7 = 0
            r9 = 8
            r10 = 0
            r3 = r11
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r1 = r11
            r1.f420951d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ns2.q.<init>(androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.Fragment, java.lang.Integer, java.util.List, java.lang.String, int, kotlin.jvm.internal.i):void");
    }

    @Override // ns2.l
    public void a() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        for (android.view.View view : this.f420949c) {
            java.lang.Integer num = this.f420951d;
            if (num != null) {
                int intValue = num.intValue();
                c22699x3dcdb352 = view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view : null;
                if (c22699x3dcdb352 != null) {
                    c22699x3dcdb352.m82040x7541828(intValue);
                }
            } else {
                boolean z17 = view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = z17 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view : null;
                if (c22699x3dcdb3522 != null) {
                    c22699x3dcdb3522.m82040x7541828(0);
                }
                c22699x3dcdb352 = z17 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view : null;
                if (c22699x3dcdb352 != null) {
                    c22699x3dcdb352.clearColorFilter();
                }
            }
        }
    }
}

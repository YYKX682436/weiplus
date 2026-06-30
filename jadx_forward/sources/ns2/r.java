package ns2;

/* loaded from: classes2.dex */
public final class r extends ns2.o {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f420952d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 r9, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 r10, java.util.List r11, java.lang.String r12, int r13, p3321xbce91901.jvm.p3324x21ffc6bd.i r14) {
        /*
            r8 = this;
            r13 = r13 & 8
            if (r13 == 0) goto L6
            java.lang.String r12 = ""
        L6:
            r5 = r12
            java.lang.String r12 = "activity"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r12)
            java.lang.String r12 = "weImageDatas"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r12)
            java.lang.String r12 = "name"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r12)
            r3 = 0
            r4 = 0
            r6 = 8
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f420952d = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ns2.r.<init>(androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.Fragment, java.util.List, java.lang.String, int, kotlin.jvm.internal.i):void");
    }

    @Override // ns2.l
    public void a() {
        android.view.KeyEvent.Callback findViewById;
        for (jz5.l lVar : this.f420952d) {
            int intValue = ((java.lang.Number) lVar.f384366d).intValue();
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f420948b;
            if (componentCallbacksC1101xa17d4670 != null) {
                android.view.View m7474xfb86a31b = componentCallbacksC1101xa17d4670.m7474xfb86a31b();
                findViewById = m7474xfb86a31b != null ? m7474xfb86a31b.findViewById(intValue) : null;
            } else {
                findViewById = this.f420947a.findViewById(intValue);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = findViewById instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById : null;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageResource(((java.lang.Number) lVar.f384367e).intValue());
            }
        }
    }
}

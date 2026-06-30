package zu3;

/* loaded from: classes10.dex */
public final class m extends zu3.v {

    /* renamed from: p0, reason: collision with root package name */
    public long f557356p0;

    /* renamed from: getLastLrcTime */
    private final long m179538x6368ab5e() {
        return m179539xc7cb6723() > 0 ? m179539xc7cb6723() : ((r45.ge4) kz5.n0.i0(m179550xb5b1aaa8())).f456701e + m179547x150b90b8();
    }

    /* renamed from: getMusicDuration */
    private final long m179539xc7cb6723() {
        zu3.t m179549xb5b0751d = m179549xb5b0751d();
        if (m179549xb5b0751d != null) {
            return m179549xb5b0751d.f557364h;
        }
        return 0L;
    }

    @Override // cw3.s
    public boolean a(long j17) {
        this.f557356p0 = j17;
        while (this.f557356p0 > m179538x6368ab5e()) {
            this.f557356p0 -= m179538x6368ab5e();
        }
        return super.a(j17);
    }

    @Override // zu3.v
    public void f() {
        if (m179543x9be85be8() < m179550xb5b1aaa8().size()) {
            long j17 = m179550xb5b1aaa8().get(m179543x9be85be8()).f456701e;
            r45.ge4 ge4Var = (r45.ge4) kz5.n0.a0(m179550xb5b1aaa8(), m179543x9be85be8() + 1);
            long m179538x6368ab5e = ge4Var != null ? ge4Var.f456701e : m179538x6368ab5e();
            long m179556x2eca39fa = m179556x2eca39fa();
            long j18 = this.f557356p0;
            long j19 = j18 - j17;
            if (0 <= j19 && j19 <= m179556x2eca39fa) {
                m179569x52b5721c((int) ((255 * ((float) (j18 - j17))) / ((float) m179556x2eca39fa())));
                return;
            }
            long m179556x2eca39fa2 = m179556x2eca39fa();
            long j27 = this.f557356p0;
            long j28 = m179538x6368ab5e - j27;
            if (0 <= j28 && j28 <= m179556x2eca39fa2) {
                m179569x52b5721c((int) (255 * (((float) (m179538x6368ab5e - j27)) / ((float) m179556x2eca39fa()))));
            } else if (j27 - j17 <= m179556x2eca39fa() || m179538x6368ab5e - this.f557356p0 <= m179556x2eca39fa()) {
                m179569x52b5721c(0);
            } else {
                m179569x52b5721c(255);
            }
        }
    }

    @Override // zu3.v
    public void k(long j17) {
        if (m179566x59ce932f() < 255) {
            long m179556x2eca39fa = m179556x2eca39fa();
            long j18 = this.f557356p0;
            long j19 = j18 - j17;
            boolean z17 = false;
            if (0 <= j19 && j19 <= m179556x2eca39fa) {
                z17 = true;
            }
            if (z17) {
                m179586xb62253a3((int) ((255 * ((float) (j18 - j17))) / ((float) m179556x2eca39fa())));
            } else if (j18 - j17 > m179556x2eca39fa()) {
                m179586xb62253a3(255);
            }
        }
    }

    @Override // zu3.v
    public void m() {
        int i17;
        if (m179550xb5b1aaa8().isEmpty()) {
            return;
        }
        java.util.ArrayList<r45.ge4> m179550xb5b1aaa8 = m179550xb5b1aaa8();
        java.util.ListIterator<r45.ge4> listIterator = m179550xb5b1aaa8.listIterator(m179550xb5b1aaa8.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i17 = -1;
                break;
            } else {
                if (this.f557356p0 >= listIterator.previous().f456701e) {
                    i17 = listIterator.nextIndex();
                    break;
                }
            }
        }
        m179571x96a0bcf4(java.lang.Math.max(0, i17));
    }

    @Override // zu3.v, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        canvas.save();
        if (m179565x73fb26bc() != null) {
            canvas.setMatrix(m179565x73fb26bc());
        } else {
            canvas.setMatrix(m179563xbfb64d6f().f106450g);
        }
        if (isActivated()) {
            m179546xf2338d75().draw(canvas);
        }
        m();
        d(canvas);
        if ((!m179542x86539e63().isEmpty()) && m179543x9be85be8() < m179542x86539e63().size()) {
            f();
            m179552x74f59ea8().setAlpha(getAlpha());
            canvas.drawBitmap(m179542x86539e63().get(m179543x9be85be8()), 0.0f, m179548xbad86207(), m179552x74f59ea8());
        }
        canvas.restore();
        if (m179551x51a41f67()) {
            invalidate();
        }
    }

    @Override // zu3.v, zu3.n
    public av3.a p(android.graphics.Matrix matrix) {
        if (m179542x86539e63().isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : m179550xb5b1aaa8()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.ge4 ge4Var = (r45.ge4) obj;
            if (i17 < m179542x86539e63().size()) {
                android.graphics.Bitmap bitmap = m179542x86539e63().get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bitmap, "get(...)");
                arrayList.add(new av3.g(ge4Var, bitmap));
            }
            i17 = i18;
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.postConcat(m179563xbfb64d6f().f106450g);
        return new av3.f(arrayList, matrix2, m179539xc7cb6723());
    }

    public av3.h r(zu3.t item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        n(item.f557363g);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : m179550xb5b1aaa8()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.graphics.Bitmap bitmap = m179542x86539e63().get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bitmap, "get(...)");
            arrayList.add(new av3.g((r45.ge4) obj, bitmap));
            i17 = i18;
        }
        return new av3.f(arrayList, item.f557296f, m179539xc7cb6723());
    }
}

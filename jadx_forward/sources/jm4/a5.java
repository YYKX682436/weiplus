package jm4;

/* loaded from: classes11.dex */
public class a5 extends com.p314xaae8f345.p3118xeeebfacc.C26830xc629eb9c implements jm4.z4 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f381905f = 0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f381906d = {false};

    /* renamed from: e, reason: collision with root package name */
    public boolean f381907e;

    public boolean a() {
        synchronized (this) {
            if (this.f381906d[0]) {
                return this.f381907e;
            }
            boolean m169019x21b29a45 = p3380x6a61f93.p3381xf512d0a5.C30444x21b36252.m169019x21b29a45(m105978x2737f10());
            synchronized (this) {
                this.f381907e = m169019x21b29a45;
                this.f381906d[0] = true;
            }
            return m169019x21b29a45;
        }
    }

    @Override // com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190, com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055
    /* renamed from: notifyFieldUpdated */
    public void mo105982x3f27f04a(int i17) {
        synchronized (this) {
            this.f381906d[i17] = false;
        }
    }
}

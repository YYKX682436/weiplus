package p012xc85e97e9.p100xa8fcbcdb;

/* loaded from: classes13.dex */
public class r extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p100xa8fcbcdb.AbstractC1149x21d497cd f93369a;

    public r(p012xc85e97e9.p100xa8fcbcdb.AbstractC1149x21d497cd abstractC1149x21d497cd) {
        this.f93369a = abstractC1149x21d497cd;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        if (message.what != 1) {
            return;
        }
        p012xc85e97e9.p100xa8fcbcdb.AbstractC1149x21d497cd abstractC1149x21d497cd = this.f93369a;
        p012xc85e97e9.p100xa8fcbcdb.C1151xb1835d47 c1151xb1835d47 = abstractC1149x21d497cd.f93308d.f93333g;
        if (c1151xb1835d47 != null) {
            abstractC1149x21d497cd.f93309e.mo7960x6cab2c8d(new p012xc85e97e9.p100xa8fcbcdb.x(c1151xb1835d47));
            c1151xb1835d47.p();
        }
    }
}

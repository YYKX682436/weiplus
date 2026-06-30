package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes5.dex */
public abstract class k1 {
    public static p012xc85e97e9.p093xedfae76a.j1 a(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, p012xc85e97e9.p093xedfae76a.f1 f1Var) {
        android.app.Application application = activityC1102x9ee2d9f.getApplication();
        if (application == null) {
            throw new java.lang.IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
        }
        if (f1Var == null) {
            if (p012xc85e97e9.p093xedfae76a.e1.f93154c == null) {
                p012xc85e97e9.p093xedfae76a.e1.f93154c = new p012xc85e97e9.p093xedfae76a.e1(application);
            }
            f1Var = p012xc85e97e9.p093xedfae76a.e1.f93154c;
        }
        return new p012xc85e97e9.p093xedfae76a.j1(activityC1102x9ee2d9f.getViewModel(), f1Var);
    }
}

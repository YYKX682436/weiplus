package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes7.dex */
public enum m {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public p012xc85e97e9.p093xedfae76a.n h() {
        switch (p012xc85e97e9.p093xedfae76a.l.f93168b[ordinal()]) {
            case 1:
            case 2:
                return p012xc85e97e9.p093xedfae76a.n.CREATED;
            case 3:
            case 4:
                return p012xc85e97e9.p093xedfae76a.n.STARTED;
            case 5:
                return p012xc85e97e9.p093xedfae76a.n.RESUMED;
            case 6:
                return p012xc85e97e9.p093xedfae76a.n.DESTROYED;
            default:
                throw new java.lang.IllegalArgumentException(this + " has no target state");
        }
    }
}

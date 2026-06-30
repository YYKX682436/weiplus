package c1;

/* loaded from: classes14.dex */
public enum j0 implements c1.i0 {
    Active,
    ActiveParent,
    Captured,
    Deactivated,
    DeactivatedParent,
    Inactive;

    public final boolean h() {
        int ordinal = ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
            if (ordinal == 3 || ordinal == 4) {
                return true;
            }
            if (ordinal != 5) {
                throw new jz5.j();
            }
        }
        return false;
    }

    public boolean i() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return true;
            }
            if (ordinal != 3 && ordinal != 4 && ordinal != 5) {
                throw new jz5.j();
            }
        }
        return false;
    }
}

package bl1;

/* loaded from: classes7.dex */
public abstract class a {
    public static java.lang.String a(int i17) {
        switch (i17) {
            case 0:
                return "ACTION_DOWN";
            case 1:
                return "ACTION_UP";
            case 2:
                return "ACTION_MOVE";
            case 3:
                return "ACTION_CANCEL";
            case 4:
                return "ACTION_OUTSIDE";
            case 5:
            case 6:
            default:
                int i18 = (65280 & i17) >> 8;
                int i19 = i17 & 255;
                if (i19 == 5) {
                    return "ACTION_POINTER_DOWN(" + i18 + ")";
                }
                if (i19 != 6) {
                    return java.lang.Integer.toString(i17);
                }
                return "ACTION_POINTER_UP(" + i18 + ")";
            case 7:
                return "ACTION_HOVER_MOVE";
            case 8:
                return "ACTION_SCROLL";
            case 9:
                return "ACTION_HOVER_ENTER";
            case 10:
                return "ACTION_HOVER_EXIT";
            case 11:
                return "ACTION_BUTTON_PRESS";
            case 12:
                return "ACTION_BUTTON_RELEASE";
        }
    }

    public static java.lang.String b(android.view.MotionEvent motionEvent) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MotionEvent { action=");
        sb6.append(a(motionEvent.getAction()));
        int pointerCount = motionEvent.getPointerCount();
        for (int i17 = 0; i17 < pointerCount; i17++) {
            sb6.append(", x[");
            sb6.append(i17);
            sb6.append("]=");
            sb6.append(motionEvent.getX(i17));
            sb6.append(", y[");
            sb6.append(i17);
            sb6.append("]=");
            sb6.append(motionEvent.getY(i17));
        }
        sb6.append(", downTime=");
        sb6.append(motionEvent.getDownTime());
        sb6.append(" }");
        return sb6.toString();
    }

    public static void c(java.lang.String str, java.lang.String str2, android.view.MotionEvent motionEvent) {
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() >= 1) {
            return;
        }
        a(motionEvent.getAction());
        int pointerCount = motionEvent.getPointerCount();
        for (int i17 = 0; i17 < pointerCount; i17++) {
            motionEvent.getX(i17);
            motionEvent.getY(i17);
        }
        motionEvent.getDownTime();
    }
}

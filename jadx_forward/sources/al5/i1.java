package al5;

/* loaded from: classes9.dex */
public class i1 {
    public i1(al5.j1 j1Var) {
    }

    public android.widget.NumberPicker a(android.view.ViewGroup viewGroup) {
        android.widget.NumberPicker a17;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt instanceof android.widget.NumberPicker) {
                android.widget.NumberPicker numberPicker = (android.widget.NumberPicker) childAt;
                if (numberPicker.getMaxValue() >= 28 && numberPicker.getMaxValue() <= 31) {
                    return numberPicker;
                }
            }
            if ((childAt instanceof android.view.ViewGroup) && (a17 = a((android.view.ViewGroup) childAt)) != null) {
                return a17;
            }
        }
        return null;
    }
}

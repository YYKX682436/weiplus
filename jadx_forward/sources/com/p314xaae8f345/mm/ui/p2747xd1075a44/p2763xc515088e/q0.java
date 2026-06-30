package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* loaded from: classes15.dex */
public abstract class q0 {
    public static void a(android.widget.NumberPicker numberPicker) {
        if (numberPicker == null) {
            return;
        }
        try {
            android.widget.EditText editText = (android.widget.EditText) new com.p314xaae8f345.mm.ui.ak(numberPicker, "mInputText", null).a();
            if (editText != null) {
                editText.setFilters(new android.text.InputFilter[0]);
            }
        } catch (java.lang.IllegalAccessException e17) {
            com.p314xaae8f345.mm.ui.yk.d("NumberPickerUtil", e17, "fixDefaultValueDisplaying IllegalAccessException", new java.lang.Object[0]);
        } catch (java.lang.NoSuchFieldException e18) {
            com.p314xaae8f345.mm.ui.yk.d("NumberPickerUtil", e18, "fixDefaultValueDisplaying NoSuchFieldException", new java.lang.Object[0]);
        }
    }

    public static android.widget.EditText b(android.widget.NumberPicker numberPicker) {
        if (numberPicker == null) {
            return null;
        }
        try {
            return (android.widget.EditText) new com.p314xaae8f345.mm.ui.ak(numberPicker, "mInputText", null).a();
        } catch (java.lang.IllegalAccessException e17) {
            com.p314xaae8f345.mm.ui.yk.d("NumberPickerUtil", e17, "getInputText IllegalAccessException", new java.lang.Object[0]);
            return null;
        } catch (java.lang.NoSuchFieldException e18) {
            com.p314xaae8f345.mm.ui.yk.d("NumberPickerUtil", e18, "getInputText NoSuchFieldException", new java.lang.Object[0]);
            return null;
        }
    }

    public static void c(android.widget.NumberPicker numberPicker, android.graphics.drawable.Drawable drawable) {
        if (numberPicker != null) {
            try {
                com.p314xaae8f345.mm.ui.ak akVar = new com.p314xaae8f345.mm.ui.ak(numberPicker, "mSelectionDivider", null);
                akVar.b();
                java.lang.reflect.Field field = akVar.f278675d;
                if (field == null) {
                    throw new java.lang.NoSuchFieldException();
                }
                field.set(numberPicker, drawable);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static void d(android.widget.NumberPicker numberPicker) {
        if (numberPicker == null) {
            return;
        }
        numberPicker.setDescendantFocusability(393216);
    }

    public static void e(android.widget.NumberPicker numberPicker) {
        if (numberPicker == null) {
            return;
        }
        try {
            java.lang.Runnable runnable = (java.lang.Runnable) new com.p314xaae8f345.mm.ui.ak(numberPicker, "mSetSelectionCommand", null).a();
            if (runnable != null) {
                numberPicker.removeCallbacks(runnable);
            }
        } catch (java.lang.IllegalAccessException e17) {
            com.p314xaae8f345.mm.ui.yk.d("NumberPickerUtil", e17, "removePendingSetSelectionCommand IllegalAccessException", new java.lang.Object[0]);
        } catch (java.lang.NoSuchFieldException e18) {
            com.p314xaae8f345.mm.ui.yk.d("NumberPickerUtil", e18, "removePendingSetSelectionCommand NoSuchFieldException", new java.lang.Object[0]);
        }
    }

    public static void f(android.widget.NumberPicker numberPicker, int i17) {
        int childCount = numberPicker.getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = numberPicker.getChildAt(i18);
            if (childAt instanceof android.widget.EditText) {
                android.graphics.Paint paint = null;
                try {
                    paint = (android.graphics.Paint) new com.p314xaae8f345.mm.ui.ak(numberPicker, "mSelectorWheelPaint", null).a();
                } catch (java.lang.IllegalAccessException e17) {
                    com.p314xaae8f345.mm.ui.yk.d("NumberPickerUtil", e17, "getSelectorWheelPaint IllegalAccessException", new java.lang.Object[0]);
                } catch (java.lang.NoSuchFieldException e18) {
                    com.p314xaae8f345.mm.ui.yk.d("NumberPickerUtil", e18, "getSelectorWheelPaint NoSuchFieldException", new java.lang.Object[0]);
                }
                if (paint != null) {
                    paint.setColor(i17);
                }
                ((android.widget.EditText) childAt).setTextColor(i17);
                numberPicker.invalidate();
            }
        }
    }
}

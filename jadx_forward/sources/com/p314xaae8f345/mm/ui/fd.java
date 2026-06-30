package com.p314xaae8f345.mm.ui;

/* loaded from: classes13.dex */
public class fd implements android.view.LayoutInflater.Factory {

    /* renamed from: d, reason: collision with root package name */
    public android.view.LayoutInflater f289983d;

    /* renamed from: e, reason: collision with root package name */
    public xn5.e0 f289984e;

    /* renamed from: f, reason: collision with root package name */
    public int f289985f;

    /* renamed from: g, reason: collision with root package name */
    public int f289986g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.fd f289987h;

    public fd(com.p314xaae8f345.mm.ui.ed edVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static android.view.View b(java.lang.String str, android.view.View view, android.content.Context context, android.util.AttributeSet attributeSet) {
        int attributeResourceValue;
        int attributeResourceValue2;
        int hashCode = str.hashCode();
        if (hashCode != -938935918 && hashCode != 2001146706 && hashCode != 1666676343 && hashCode != 1601505219 && hashCode != 776382189 && hashCode != 1125864064 && hashCode != -307023012 && hashCode != 742575657 && hashCode != 1622375284 && hashCode != -1455429095 && hashCode != 1690268602 && hashCode != 321475187 && hashCode != 913567 && hashCode != -472572735 && hashCode != 1967364924 && hashCode != 295445588 && hashCode != -720637559 && hashCode != -124208923 && hashCode != 310672300 && hashCode != 1524180521 && hashCode != -1299757303 && hashCode != -527895810 && hashCode != -1374364899 && hashCode != 132421285 && hashCode != 418111674 && hashCode != 540561289 && hashCode != 1079639440 && hashCode != 2077030397 && hashCode != 2076872964 && hashCode != -771693267 && hashCode != 200122345 && hashCode != 999067519 && hashCode != -1489232690 && hashCode != -1259604263 && hashCode != -1601904316 && hashCode != 1226216429 && hashCode != 960005444 && hashCode != -1568925917 && hashCode != -251296369 && hashCode != 687897231 && hashCode != -602931483 && hashCode != -1992485345 && hashCode != -1159437000 && hashCode != 1262601901 && hashCode != -455447493 && hashCode != 1215740217 && hashCode != -1142652473 && hashCode != 863703231 && hashCode != -978427796 && hashCode != -602460368 && hashCode != -529817397 && hashCode != -1880646591 && hashCode != -1307546587) {
            return view;
        }
        int i17 = 0;
        if (hq.b.a()) {
            if (view instanceof android.widget.RadioButton) {
                android.widget.RadioButton radioButton = (android.widget.RadioButton) view;
                if (attributeSet != null) {
                    int attributeResourceValue3 = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "textColor", -1);
                    if (attributeResourceValue3 > 0) {
                        radioButton.setTextColor(radioButton.getContext().getResources().getColorStateList(attributeResourceValue3));
                    }
                    int[] iArr = com.p314xaae8f345.mm.ui.id.f290456e;
                    android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
                    for (int i18 = 0; i18 < 2; i18++) {
                        int resourceId = obtainStyledAttributes.getResourceId(i18, 0);
                        if (resourceId != 0) {
                            int i19 = iArr[i18];
                            if (i19 == 16842904) {
                                radioButton.setTextColor(radioButton.getContext().getResources().getColorStateList(resourceId));
                            } else if (i19 == 16843015 && hq.b.a() && resourceId == com.p314xaae8f345.mm.R.C30861xcebc809e.axu) {
                                radioButton.setButtonDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.axv);
                            }
                        }
                    }
                }
            } else if (view instanceof android.widget.Button) {
                android.widget.Button button = (android.widget.Button) view;
                if (attributeSet != null) {
                    int attributeResourceValue4 = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "textColor", -1);
                    if (attributeResourceValue4 > 0) {
                        button.setTextColor(button.getContext().getResources().getColorStateList(attributeResourceValue4));
                    }
                    int[] iArr2 = com.p314xaae8f345.mm.ui.id.f290455d;
                    android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2);
                    int i27 = 0;
                    for (int i28 = 2; i27 < i28; i28 = 2) {
                        int resourceId2 = obtainStyledAttributes2.getResourceId(i27, i17);
                        if (resourceId2 != 0) {
                            int i29 = iArr2[i27];
                            if (i29 == 16842904) {
                                button.setTextColor(button.getContext().getResources().getColorStateList(resourceId2));
                            } else if (i29 == 16842964 && hq.b.a()) {
                                if (resourceId2 == com.p314xaae8f345.mm.R.C30861xcebc809e.f562590jk) {
                                    button.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562591jl);
                                } else if (resourceId2 == com.p314xaae8f345.mm.R.C30861xcebc809e.f562593jo || resourceId2 == com.p314xaae8f345.mm.R.C30861xcebc809e.f562587jg) {
                                    button.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562594jp);
                                } else if (resourceId2 == com.p314xaae8f345.mm.R.C30861xcebc809e.aoe) {
                                    button.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aog);
                                } else if (resourceId2 == com.p314xaae8f345.mm.R.C30861xcebc809e.aoi) {
                                    button.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aoj);
                                }
                            }
                        }
                        i27++;
                        i17 = 0;
                    }
                }
            } else {
                boolean z17 = view instanceof android.widget.TextView;
                int[] iArr3 = com.p314xaae8f345.mm.ui.id.f290454c;
                if (z17) {
                    android.widget.TextView textView = (android.widget.TextView) view;
                    if (attributeSet != null) {
                        int attributeResourceValue5 = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "textColor", -1);
                        if (attributeResourceValue5 > 0) {
                            textView.setTextColor(textView.getContext().getResources().getColorStateList(attributeResourceValue5));
                        }
                        int attributeResourceValue6 = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "textColorHint", -1);
                        if (attributeResourceValue6 > 0) {
                            textView.setHintTextColor(textView.getContext().getResources().getColor(attributeResourceValue6));
                        }
                        android.content.res.TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, iArr3);
                        for (int i37 = 0; i37 < 3; i37++) {
                            int resourceId3 = obtainStyledAttributes3.getResourceId(i37, 0);
                            if (resourceId3 != 0) {
                                int i38 = iArr3[i37];
                                if (i38 == 16842904) {
                                    textView.setTextColor(textView.getContext().getResources().getColorStateList(resourceId3));
                                } else if (i38 == 16842906) {
                                    textView.setHintTextColor(textView.getContext().getResources().getColorStateList(resourceId3));
                                } else if (i38 == 16842964 && hq.b.a() && (resourceId3 == com.p314xaae8f345.mm.R.C30861xcebc809e.f562593jo || resourceId3 == com.p314xaae8f345.mm.R.C30861xcebc809e.f562587jg)) {
                                    textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562594jp);
                                }
                            }
                        }
                    }
                } else if (view instanceof android.widget.EditText) {
                    android.widget.EditText editText = (android.widget.EditText) view;
                    if (attributeSet != null) {
                        int attributeResourceValue7 = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "textColor", -1);
                        if (attributeResourceValue7 > 0) {
                            editText.setTextColor(editText.getContext().getResources().getColor(attributeResourceValue7));
                        }
                        int attributeResourceValue8 = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "textColorHint", -1);
                        if (attributeResourceValue8 > 0) {
                            editText.setHintTextColor(editText.getContext().getResources().getColor(attributeResourceValue8));
                        }
                        android.content.res.TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
                        for (int i39 = 0; i39 < 3; i39++) {
                            int resourceId4 = obtainStyledAttributes4.getResourceId(i39, 0);
                            if (resourceId4 != 0) {
                                int i47 = iArr3[i39];
                                if (i47 == 16842904) {
                                    editText.setTextColor(editText.getContext().getResources().getColor(resourceId4));
                                } else if (i47 == 16842906) {
                                    editText.setHintTextColor(editText.getContext().getResources().getColorStateList(resourceId4));
                                }
                            }
                        }
                    }
                } else if (view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view;
                    if (attributeSet != null) {
                        int attributeResourceValue9 = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "textColor", -1);
                        if (attributeResourceValue9 > 0) {
                            c22624x85d69039.m84183x1c5c5ff4(c22624x85d69039.getContext().getResources().getColor(attributeResourceValue9));
                        }
                        android.content.res.TypedArray obtainStyledAttributes5 = context.obtainStyledAttributes(attributeSet, iArr3);
                        for (int i48 = 0; i48 < 3; i48++) {
                            int resourceId5 = obtainStyledAttributes5.getResourceId(i48, 0);
                            if (resourceId5 != 0 && iArr3[i48] == 16842904) {
                                c22624x85d69039.m84183x1c5c5ff4(c22624x85d69039.getContext().getResources().getColor(resourceId5));
                            }
                        }
                    }
                }
            }
        }
        boolean z18 = view instanceof android.widget.TextView;
        if (z18) {
            android.widget.TextView textView2 = (android.widget.TextView) view;
            float lineSpacingMultiplier = textView2.getLineSpacingMultiplier();
            float lineSpacingExtra = textView2.getLineSpacingExtra();
            if (lineSpacingMultiplier < 1.1d && lineSpacingExtra == 0.0f) {
                textView2.setLineSpacing(0.0f, 1.1f);
            }
        } else if (view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690392 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view;
            float m84157x5274cf1a = c22624x85d690392.m84157x5274cf1a();
            c22624x85d690392.m84156x66610f17();
            if (m84157x5274cf1a < 1.1d) {
                c22624x85d690392.k(0.0f, 1.1f);
            }
        } else if (view instanceof com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10808xd74620) {
            com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10808xd74620 c10808xd74620 = (com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10808xd74620) view;
            float m46325x5274cf1a = c10808xd74620.m46325x5274cf1a();
            float m46324x66610f17 = c10808xd74620.m46324x66610f17();
            if (m46325x5274cf1a < 1.1d && m46324x66610f17 == 0.0f) {
                c10808xd74620.e(0.0f, 1.1f);
            }
        }
        float q17 = i65.a.q(context);
        com.p314xaae8f345.mm.ui.zk.f294171b = q17;
        if ((com.p314xaae8f345.mm.ui.bk.M(q17, i65.a.u(context)) || com.p314xaae8f345.mm.ui.bk.M(q17, i65.a.v(context))) && hashCode != 1690268602 && hashCode != 321475187 && hashCode != -771693267 && hashCode != 200122345 && hashCode != 999067519 && hashCode != -472572735 && hashCode != 1967364924 && hashCode != -602931483 && hashCode != -1992485345 && hashCode != -1159437000 && hashCode != 1262601901 && hashCode != 295445588) {
            q17 = i65.a.t(context);
        }
        int[] iArr4 = com.p314xaae8f345.mm.ui.id.f290452a;
        if (hashCode == -938935918 || hashCode == 1690268602 || hashCode == 321475187 || hashCode == 960005444 || hashCode == 2076872964 || hashCode == -251296369 || hashCode == 863703231) {
            android.widget.TextView textView3 = (android.widget.TextView) view;
            float textSize = (textView3.getTextSize() * q17) / i65.a.g(textView3.getContext());
            textView3.setTextSize(1, textSize);
            if (hashCode == -251296369) {
                p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.b(textView3, 1, (int) textSize, 1, 1);
            }
            j65.v.c(context.getAssets()).getClass();
            if (j65.v.f379513e) {
                android.content.res.TypedArray obtainStyledAttributes6 = context.obtainStyledAttributes(attributeSet, iArr4);
                for (int i49 = 0; i49 < 3; i49++) {
                    int resourceId6 = obtainStyledAttributes6.getResourceId(i49, 0);
                    if (resourceId6 != 0) {
                        int i57 = iArr4[i49];
                        if (i57 == 16843379) {
                            textView3.setContentDescription(context.getString(resourceId6));
                        } else if (i57 == 16843088) {
                            textView3.setHint(context.getString(resourceId6));
                        } else {
                            textView3.setText(context.getString(resourceId6));
                        }
                    }
                }
                obtainStyledAttributes6.recycle();
            } else {
                jg5.c.f381198a.a(view, 1);
            }
        } else if (hashCode == 2001146706 || hashCode == 687897231) {
            android.widget.Button button2 = (android.widget.Button) view;
            float textSize2 = (button2.getTextSize() * q17) / i65.a.g(button2.getContext());
            button2.setTextSize(1, textSize2);
            if (hashCode == 687897231) {
                p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.b(button2, 1, (int) textSize2, 1, 1);
            }
            j65.v.c(context.getAssets()).getClass();
            if (j65.v.f379513e) {
                android.content.res.TypedArray obtainStyledAttributes7 = context.obtainStyledAttributes(attributeSet, iArr4);
                int i58 = 0;
                for (int i59 = 3; i58 < i59; i59 = 3) {
                    int resourceId7 = obtainStyledAttributes7.getResourceId(i58, 0);
                    if (resourceId7 != 0) {
                        int i66 = iArr4[i58];
                        if (i66 == 16843379) {
                            button2.setContentDescription(context.getString(resourceId7));
                        } else if (i66 == 16843088) {
                            button2.setHint(context.getString(resourceId7));
                        } else {
                            button2.setText(context.getString(resourceId7));
                        }
                    }
                    i58++;
                }
                obtainStyledAttributes7.recycle();
            }
        } else if (hashCode == 1666676343 || hashCode == 913567 || hashCode == -720637559 || hashCode == -124208923 || hashCode == 132421285 || hashCode == 310672300 || hashCode == 1524180521 || hashCode == -1489232690) {
            android.widget.EditText editText2 = (android.widget.EditText) view;
            editText2.setTextSize(1, (editText2.getTextSize() * q17) / i65.a.g(editText2.getContext()));
            j65.v.c(context.getAssets()).getClass();
            if (j65.v.f379513e) {
                android.content.res.TypedArray obtainStyledAttributes8 = context.obtainStyledAttributes(attributeSet, iArr4);
                for (int i67 = 0; i67 < 3; i67++) {
                    int resourceId8 = obtainStyledAttributes8.getResourceId(i67, 0);
                    if (resourceId8 != 0) {
                        int i68 = iArr4[i67];
                        if (i68 == 16843379) {
                            editText2.setContentDescription(context.getString(resourceId8));
                        } else if (i68 == 16843088) {
                            editText2.setHint(context.getString(resourceId8));
                        } else {
                            editText2.setText(context.getString(resourceId8));
                        }
                    }
                }
                obtainStyledAttributes8.recycle();
            } else {
                jg5.c.f381198a.a(view, 1);
            }
        } else if (hashCode == -602460368 || hashCode == -529817397 || hashCode == -978427796 || hashCode == -1880646591) {
            jg5.c.f381198a.a(view, 1);
        } else if (hashCode == -602931483 || hashCode == -1992485345 || hashCode == 1262601901) {
            fl5.i iVar = (fl5.i) view;
            iVar.mo81593x3abfd950(1, (iVar.mo81572x40077844() * q17) / i65.a.g(iVar.p()));
            j65.v.c(context.getAssets()).getClass();
            if (j65.v.f379513e) {
                android.content.res.TypedArray obtainStyledAttributes9 = context.obtainStyledAttributes(attributeSet, iArr4);
                for (int i69 = 0; i69 < 3; i69++) {
                    int resourceId9 = obtainStyledAttributes9.getResourceId(i69, 0);
                    if (resourceId9 != 0) {
                        int i76 = iArr4[i69];
                        if (i76 == 16843379) {
                            iVar.setContentDescription(context.getString(resourceId9));
                        } else if (i76 == 16843088) {
                            iVar.mo81584x764b0e09(context.getString(resourceId9));
                        } else {
                            iVar.mo81590x765074af(context.getString(resourceId9));
                        }
                    }
                }
                obtainStyledAttributes9.recycle();
            } else {
                android.text.Editable text = iVar.getText();
                if (!android.text.TextUtils.isEmpty(text)) {
                    iVar.mo81590x765074af(com.p314xaae8f345.mm.ui.hd.c(text));
                }
                java.lang.CharSequence mo81561xfb8046fd = iVar.mo81561xfb8046fd();
                if (!android.text.TextUtils.isEmpty(mo81561xfb8046fd)) {
                    iVar.mo81584x764b0e09(com.p314xaae8f345.mm.ui.hd.c(mo81561xfb8046fd));
                }
                java.lang.CharSequence contentDescription = iVar.getContentDescription();
                if (!android.text.TextUtils.isEmpty(contentDescription)) {
                    iVar.setContentDescription(com.p314xaae8f345.mm.ui.hd.c(contentDescription));
                }
                jg5.c.f381198a.a(view, 1);
            }
        } else if (hashCode == 1601505219) {
            android.widget.CheckBox checkBox = (android.widget.CheckBox) view;
            checkBox.setTextSize(1, (checkBox.getTextSize() * q17) / i65.a.g(checkBox.getContext()));
            j65.v.c(context.getAssets()).getClass();
            if (j65.v.f379513e) {
                android.content.res.TypedArray obtainStyledAttributes10 = context.obtainStyledAttributes(attributeSet, iArr4);
                for (int i77 = 0; i77 < 3; i77++) {
                    int resourceId10 = obtainStyledAttributes10.getResourceId(i77, 0);
                    if (resourceId10 != 0) {
                        int i78 = iArr4[i77];
                        if (i78 == 16843379) {
                            checkBox.setContentDescription(context.getString(resourceId10));
                        } else if (i78 == 16843088) {
                            checkBox.setHint(context.getString(resourceId10));
                        } else {
                            checkBox.setText(context.getString(resourceId10));
                        }
                    }
                }
                obtainStyledAttributes10.recycle();
            }
        } else if (hashCode == 1125864064) {
            android.widget.ImageView imageView = (android.widget.ImageView) view;
            j65.v.c(context.getAssets()).getClass();
            if (j65.v.f379513e) {
                android.content.res.TypedArray obtainStyledAttributes11 = context.obtainStyledAttributes(attributeSet, com.p314xaae8f345.mm.ui.id.f290453b);
                for (int i79 = 0; i79 < 1; i79++) {
                    int resourceId11 = obtainStyledAttributes11.getResourceId(i79, 0);
                    if (resourceId11 != 0 && com.p314xaae8f345.mm.ui.id.f290453b[i79] == 16843379) {
                        imageView.setContentDescription(context.getString(resourceId11));
                    }
                }
                obtainStyledAttributes11.recycle();
            } else {
                java.lang.CharSequence contentDescription2 = imageView.getContentDescription();
                if (!android.text.TextUtils.isEmpty(contentDescription2)) {
                    imageView.setContentDescription(com.p314xaae8f345.mm.ui.hd.c(contentDescription2));
                }
            }
        } else if (hashCode == -307023012) {
            if (hq.b.a()) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view;
                if (attributeSet != null && (attributeResourceValue2 = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res-auto", "iconColor", -1)) > 0) {
                    c22699x3dcdb352.m82040x7541828(c22699x3dcdb352.getContext().getResources().getColor(attributeResourceValue2));
                }
            }
        } else if (hashCode == 742575657) {
            if (hq.b.a()) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f c22698xdfbd289f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f) view;
                if (attributeSet != null && (attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res-auto", "btnIconColor", -1)) > 0) {
                    c22698xdfbd289f.m82034x7541828(c22698xdfbd289f.getContext().getResources().getColor(attributeResourceValue));
                }
            }
        } else if (hashCode == -472572735) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690393 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view;
            c22624x85d690393.l(1, (c22624x85d690393.m84164x40077844() * q17) / i65.a.g(c22624x85d690393.getContext()));
            com.p314xaae8f345.mm.ui.hd.a(c22624x85d690393);
            jg5.c.f381198a.a(view, 1);
        } else if (hashCode == 1967364924) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690394 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view;
            c22624x85d690394.l(1, (c22624x85d690394.m84164x40077844() * q17) / i65.a.g(c22624x85d690394.getContext()));
            com.p314xaae8f345.mm.ui.hd.a(c22624x85d690394);
            jg5.c.f381198a.a(view, 1);
        } else if (hashCode == -1568925917) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21519xe6b698c8 c21519xe6b698c8 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21519xe6b698c8) view;
            c21519xe6b698c8.m79152x3abfd950(c21519xe6b698c8.m79147x40077844() * q17);
        } else if (hashCode == 295445588) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22619x353059dc c22619x353059dc = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22619x353059dc) view;
            c22619x353059dc.J(1, (c22619x353059dc.m81341x40077844() * q17) / i65.a.g(c22619x353059dc.getContext()));
        } else {
            if (hashCode == -1601904316) {
                jg5.c.f381198a.a(view, 1);
            }
            if (z18) {
                android.widget.TextView textView4 = (android.widget.TextView) view;
                textView4.setTextSize(1, (textView4.getTextSize() * q17) / i65.a.g(textView4.getContext()));
            }
        }
        return view;
    }

    public android.view.View a(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        int hashCode = str.hashCode();
        android.view.View linearLayout = hashCode == 1127291599 ? new android.widget.LinearLayout(context, attributeSet) : hashCode == 1125864064 ? new android.widget.ImageView(context, attributeSet) : hashCode == -938935918 ? new android.widget.TextView(context, attributeSet) : hashCode == 2001146706 ? new android.widget.Button(context, attributeSet) : hashCode == 1666676343 ? new android.widget.EditText(context, attributeSet) : hashCode == 1601505219 ? new android.widget.CheckBox(context, attributeSet) : hashCode == 1310765783 ? new android.widget.FrameLayout(context, attributeSet) : hashCode == -443652810 ? new android.widget.RelativeLayout(context, attributeSet) : hashCode == -1455429095 ? new android.widget.CheckedTextView(context, attributeSet) : hashCode == 1410352259 ? new android.widget.ListView(context, attributeSet) : hashCode == 2666181 ? new android.view.View(context, attributeSet) : hashCode == 1260470547 ? new android.view.ViewStub(context, attributeSet) : hashCode == -1406842887 ? new android.webkit.WebView(context, attributeSet) : hashCode == -1495589242 ? new android.widget.ProgressBar(context, attributeSet) : null;
        if (linearLayout == null && str.indexOf(".") > 0) {
            linearLayout = this.f289983d.createView(str, null, attributeSet);
        }
        if (linearLayout == null) {
            linearLayout = this.f289983d.createView(str, "android.widget.", attributeSet);
        }
        if (linearLayout == null) {
            linearLayout = this.f289983d.createView(str, "android.view.", attributeSet);
        }
        if (linearLayout != null) {
            linearLayout.setTag(com.p314xaae8f345.mm.R.id.vc_, java.lang.Integer.valueOf(this.f289985f));
            linearLayout.setTag(com.p314xaae8f345.mm.R.id.nwa, java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.id.f290457f));
            linearLayout.setTag(com.p314xaae8f345.mm.R.id.nw7, java.lang.Boolean.valueOf(attributeSet.getAttributeBooleanValue(com.p314xaae8f345.mm.R.C30857x2dd9f1.f559756ld, false)));
        }
        return linearLayout;
    }

    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View view;
        com.p314xaae8f345.mm.ui.fd fdVar;
        android.view.View view2 = null;
        try {
            xn5.e0 e0Var = this.f289984e;
            view = e0Var != null ? ((xn5.g) e0Var).e(context, attributeSet, str, this.f289986g) : null;
            if (view == null) {
                try {
                    view = a(str, context, attributeSet);
                    if (view == null && (fdVar = this.f289987h) != null) {
                        view = fdVar.onCreateView(str, context, attributeSet);
                    }
                    ta5.h hVar = ta5.h.f498412a;
                    if (view != null) {
                        b(str, view, context, attributeSet);
                        if (view instanceof android.widget.TextView) {
                            com.p314xaae8f345.mm.ui.hd.b((android.widget.TextView) view);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMLayoutInflater", "Inflate view, ClassNotFound ".concat(str));
                    }
                } catch (android.view.InflateException e17) {
                    e = e17;
                    view2 = view;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMLayoutInflater", "[cpan] Inflate failed. name:%s. Use default Inflate. Exception:%s", str, e.getMessage());
                    return view2;
                } catch (java.lang.ClassNotFoundException e18) {
                    e = e18;
                    view2 = view;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMLayoutInflater", "[cpan] class not found. name:%s. Use default Inflate. Exception:%s", str, e.getMessage());
                    return view2;
                } catch (java.lang.Exception e19) {
                    e = e19;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMLayoutInflater", e, null, new java.lang.Object[0]);
                    return view;
                }
            }
            if (view instanceof android.view.ViewStub) {
                ((android.view.ViewStub) view).setLayoutInflater(this.f289983d);
            }
            this.f289986g++;
            return view;
        } catch (android.view.InflateException e27) {
            e = e27;
        } catch (java.lang.ClassNotFoundException e28) {
            e = e28;
        } catch (java.lang.Exception e29) {
            e = e29;
            view = null;
        }
    }
}
